package com.demo.lab1;

public class MultiplicationTable {
    public static void printTableFor(int number){
        System.out.println("Multiplication Table of" + number + "using for loop:");
        for (int i=1;i<=10;i++){
            System.out.println(number + "x" + i + "=" +(number * i));
        }
    }

    public static void main(String[] args){
        int input =2;
        printTableFor(input);
    }
}
