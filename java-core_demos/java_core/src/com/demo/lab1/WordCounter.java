package com.demo.lab1;

public class WordCounter {
    public static int countWords(String input){
        if (input == null || input.trim().isEmpty()){
            return 0;
        }

        String[] tokens= input.trim().split("\\s+");
        int count =0;

        for (String token : tokens){
            if (token.matches("[a-zA-Z]+")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String input = "Sum of 12 and 20 is 32";
        int wordCount = countWords(input);
        System.out.println("Word Count: " + wordCount);
    }
}
