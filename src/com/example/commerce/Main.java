package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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


        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        // 상품 리스트 반복문
        for (int i = 0; i < products.size(); i++) { // i가 products 리스트의 크기보다 작을 동안 반복
            Product p = products.get(i); // 리스트에서 i번째 상품을 가져와서 p에 저장
//            System.out.println((i + 1) + ". " + p.getName() + " | " + p.getPrice() + "원 | " + p.getIntroduction());
            System.out.printf((i + 1) + ". " + "%-11s | %,9d | %13s\n", p.getName(), p.getPrice(), p.getIntroduction()); //%d 숫자 프린트포맷함수
        }
        System.out.println("0. 종료         | 프로그램 종료");
        int select = scanner.nextInt();

        if (select == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
            System.exit(0);
        }
    }
}


