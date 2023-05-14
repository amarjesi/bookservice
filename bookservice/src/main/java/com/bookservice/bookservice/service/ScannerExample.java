package com.bookservice.bookservice.service;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            num = scanner.nextInt();
            System.out.println(num);

        }

    }
}
