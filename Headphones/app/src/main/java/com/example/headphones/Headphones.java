package com.example.headphones;

public class Headphones {
    private String itemName;
    private double itemPrice;
    private int itemimg;

    public Headphones(String itemName, double itemPrice, int itemimg) {
        this.itemName = itemName;
        this.itemimg = itemimg;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemimg() {
        return itemimg;
    }

    public void setItemimg(int itemimg) {
        this.itemimg = itemimg;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
