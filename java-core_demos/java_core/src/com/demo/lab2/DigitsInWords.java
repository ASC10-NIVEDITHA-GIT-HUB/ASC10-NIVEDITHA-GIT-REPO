package com.demo.lab2;

public class DigitsInWords {
    public static void printDigitsInWords(int number){
        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        String numStr = String.valueOf(number);

        for (char digit : numStr.toCharArray()){
            System.out.print(words[digit - '0'] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args){
        int number = 1523;

        System.out.print("Output: ");
        printDigitsInWords(number);
    }
}
