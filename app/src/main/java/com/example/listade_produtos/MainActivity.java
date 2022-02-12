package com.example.listade_produtos;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        List<PostItem> postItems = new ArrayList<>();

        postItems.add(new PostItem(1, R.drawable.mussarelapecas, R.string.mussarelapecas));
        postItems.add(new PostItem(2, R.drawable.salamespecasweb, R.string.salames));
        postItems.add(new PostItem(3, R.drawable.baconcopa, R.string.bacon_cop));
        postItems.add(new PostItem(4, R.drawable.qjminasfrscalcruzialibele, R.string.queijos_frescal));
        postItems.add(new PostItem(5, R.drawable.quijogorgonzolamaturadoricota, R.string.quiejos_gorgon));
        postItems.add(new PostItem(6, R.drawable.provolone, R.string.quiejos_provolone));
        postItems.add(new PostItem(7, R.drawable.pizzaweb, R.string.pizza));
        postItems.add(new PostItem(8, R.drawable.frangotendercarne, R.string.Frango_tender));

        PostAdapter adapter = new PostAdapter(postItems);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(
                2,StaggeredGridLayoutManager.VERTICAL));

        adapter.setListener(id -> {

            switch (id) {
                case 1:
                    Intent Mussarela = new Intent(MainActivity.this, Activity_Mussarela_pecas.class);
                    startActivity(Mussarela);
                    break;
                case 2:
                    Intent Salame = new Intent(MainActivity.this, Activity_salame.class);
                    startActivity(Salame);
                    break;
                case 3:
                    Intent bacon = new Intent(MainActivity.this, Activity_bacon_copa.class);
                    startActivity(bacon);
                    break;
                case 4:
                    Intent queijosF = new Intent(MainActivity.this, Activity_quijos_Frac_Maturas_g.class);
                    startActivity(queijosF);
                    break;
                case 5:
                    Intent frescal = new Intent(MainActivity.this, Activity_quijos_gorgonzolasFra.class);
                    startActivity(frescal);
                    break;
                case 6:
                    Intent provolone = new Intent(MainActivity.this, Activity_Provolone_coalho_espeto.class);
                    startActivity(provolone);
                    break;
                case 7:
                    Intent pzz = new Intent(MainActivity.this, Activity_Pizza.class);
                    startActivity(pzz);
                    break;
                case 8:
                    Intent frango = new Intent(MainActivity.this,Activity_frangos_Carnes.class);
                    startActivity(frango);
                    break;
            }

        });
        recyclerView.setAdapter(adapter);

    }
}
