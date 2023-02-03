package com.example.listviewpro.model;

public class Product {
    private int productId;
    private int imageId;
    private String name;
    private int quantity;
    private String price;
    private String maker;


    public Product() {
    }

    public Product(int productId, int imageId, String name, int quantity, String price, String maker) {
        this.productId = productId;
        this.imageId = imageId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.maker = maker;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", imageId=" + imageId +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price='" + price + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}
