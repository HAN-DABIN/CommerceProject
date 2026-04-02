package com.example.commerce;

public class Product {

    // 속성
    private String name;
    private int price;
    private String introduction;
    private int stock;

    // 생성자
    public Product(String name, int price, String introduction, int stock) {
        this.name = name;
        this.price = price;
        this.introduction = introduction;
        this.stock = stock;
    }
    // 기능 - getter
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getIntroduction() {
        return introduction;
    }
    public int getStock() {
        return stock;
    }
}
