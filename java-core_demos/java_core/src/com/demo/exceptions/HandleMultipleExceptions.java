package com.demo.exceptions;

public class HandleMultipleExceptions {
    public static void main(String[] args){
        String colors[] = {"red", "green", "blue"};
        Calculator calculator = null;
        System.out.println("Normal calculator");
        try{
            for(int i=0; i<=3; i--) {
                System.out.println(colors[i]);
            }
            calculator.add(50,50);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        {
            System.out.println("Check index...");
        }
        catch(NullPointerException nullPointerException){
            System.out.println("Instantiate the calculator...");
        }
        System.out.println("Thank You");
    }
}
