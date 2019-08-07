package com.example.travelmantics;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String descriptioin;
    private String price;
    private String imageUrl;
    private String imageName;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public TravelDeal() {
    }

    public TravelDeal(String title, String descriptioin, String price, String imageUrl, String imageName) {
        this.id = id;
        this.title = title;
        this.descriptioin = descriptioin;
        this.price = price;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
        this.setImageName(imageName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptioin() {
        return descriptioin;
    }

    public void setDescriptioin(String descriptioin) {
        this.descriptioin = descriptioin;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}