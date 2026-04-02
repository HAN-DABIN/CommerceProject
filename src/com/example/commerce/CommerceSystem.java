package com.example.commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Product> products; // 리스트 선언
    Scanner scanner = new Scanner(System.in);

    // 생성자 - product 관리
    public CommerceSystem(List<Product> products) {
        this.products = products; // main에서 products 전달
    }
    void start() {
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        // 상품 리스트 반복문
        for (int i = 0; i < products.size(); i++) { // i가 products 리스트의 크기보다 작을 동안 반복
            Product p = products.get(i); // 리스트에서 i번째 상품을 가져와서 p에 저장
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
