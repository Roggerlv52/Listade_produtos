package com.example.listade_produtos;

public class PostItem {
    private int id;
    private int drowableId;
    private int texStringId;
    private int color;

    public PostItem(int id, int drowableId , int texStringId) {
        this.id = id;
        this.drowableId = drowableId;
        this.texStringId = texStringId;
       // this.color = color;
    }

    public void setColo(int color) {
        this.color = color;
    }
    public void setDrowableId(int drowableId) {
        this.drowableId = drowableId;
    }

    public void setTexStringId(int texStringId) {
        this.texStringId = texStringId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrowableId() {
        return drowableId;
    }

    public int getTexStringId() {
        return texStringId;
    }

    public int getColor() {
        return color;
    }
}
