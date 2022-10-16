package com.example.insorma.modelSet;

public class Furniture {
    private String title, rating, price;
    private int cover;

    public Furniture(String title, String rating, String price, int cover) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }
}
