package com.example.commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        CommerceSystem commerceSystem = new CommerceSystem(products); // commercesystem 객체 생성

        // 객체화
        Product product1 = new Product("Galaxy S25", 1200000, "안드로이드 최신 스마트폰", 20);
        Product product2 = new Product("iPhone 17", 1350000, "Apple 최신 스마트폰", 30);
        Product product3 = new Product("MacBook pro", 2400000, "M3 칩셋이 탑재된 노트북", 10);
        Product product4 = new Product("Airpods pro", 350000, "노이즈 캔슬링 무선 이어폰", 15);

        // List에 추가
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        commerceSystem.start(); // start 호출
    }
}


