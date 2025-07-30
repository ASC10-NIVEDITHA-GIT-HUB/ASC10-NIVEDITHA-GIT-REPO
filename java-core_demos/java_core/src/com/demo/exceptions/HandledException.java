package com.demo.exceptions;

public class HandledException {
    public static void main(String[] args){
        int i =100;
        int result;
        result =0;
        System.out.println("divide by zero");
        try{
            result = i/0;
            System.out.println("will this print?");

        }
            catch (Exception exception){
                System.out.println(exception.getMessage());
                System.out.println("Gracefully handled.");
            }
        System.out.println(result);
    }
}
