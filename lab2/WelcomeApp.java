package com.demo.lab2;

public class WelcomeApp {
    public static String welcomeMessage(String name){
        return "Hello" + name + "Welcome to Ascendion!";
    }

    public static void main(String[] args){
        String name = "Niveditha";
        String message = welcomeMessage(name);
        System.out.println(message);
    }
}
