package com.bookservice.bookservice.service;

class EvenOdd {
    public static void main(String[] args) {

        System.out.println("The number is = " +evenodd(11));
    }

    public static String evenodd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
