package com.bookservice.bookservice.service;

public class SwapValue {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        swapValuesWithVariable(m,n);
        swapValueWithoutVariable(m,n);
    }
    public static void swapValuesWithVariable (int m, int n){
        //swapping the values
        int temp = m;
         m = n;
         n = temp;
        System.out.println("Value of m is "+m + " and Value of n is "+n);
    }
    public static void swapValueWithoutVariable (int m, int n){
        m = m - n;
        n = m + n;
        m = n - m;
        System.out.println("The value of m is "+m + " and The value of n is "+n);
    }
}
