package com.example.uteapp;

public class Tra {
    private int image;
    private  String ten;

    public Tra(int image,String ten) {
        this.image= image;
        this.ten= ten;
    }

    public String getTen() {
        return ten;
    }

    public int getImage() {
        return image;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setImage(int image) {
        this.image = image;
    }
}