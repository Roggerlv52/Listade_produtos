package com.example.listade_produtos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{
    private List<PostItem> postItems = new ArrayList<>();
    private OnItemClickListener listener;
    public PostAdapter(List<PostItem> postItems ) {
        this.postItems = postItems;
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view =LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.poste_item_conteiner,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.postImagemView.setImageResource(postItems.get(position).getDrowableId());
        PostItem postItem = postItems.get(position);
        holder.bid(postItem);
    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder{
        RoundedImageView postImagemView;
        PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImagemView = itemView.findViewById(R.id.imagePoster);
        }
        void bid(PostItem item){
           // TextView textView = itemView.findViewById(R.id.texto_text);
          //  ImageView imageIcon = itemView.findViewById(R.id.item_imagem);
            RoundedImageView botao = itemView.findViewById(R.id.imagePoster);

            botao.setOnClickListener(v -> listener.onClick(item.getId()));
            // textView.setText(item.getTexStringId());
          //  imageIcon.setImageResource(item.getDrowableId());
            botao.setBackgroundColor(item.getColor());


        }
    }
}
