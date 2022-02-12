package com.example.listade_produtos;

public interface OnAdapterItemClickeListene {
    void onClick(int id, String type);
    void onLongClick(int position, String type, int id);
}
