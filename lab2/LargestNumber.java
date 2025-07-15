package com.demo.lab2;

public class LargestNumber {
    public static  int largest(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }

    public static void main(String[] args){
        int num1 = 30;
        int num2 = 12;
        int num3 = 3;

        int largestNumber = largest(num1, num2, num3);

        System.out.println("The largest number is: " + largestNumber);
    }
}
