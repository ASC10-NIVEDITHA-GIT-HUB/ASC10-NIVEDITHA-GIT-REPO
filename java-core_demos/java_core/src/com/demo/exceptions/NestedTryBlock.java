package com.demo.exceptions;

class Test1{
    int value= 10;
}


public class NestedTryBlock {
    public static void main(String[] args){
        try{
            a3();
        }
        catch(ArithmeticException e){
            System.out.println("caught you");

        }
        System.out.println("Hurray");
    }
    private static void a1() {}
    private static void a2() {}
    private static void a3() {
        Test1 test = null;
        test = new Test1();
        try {
            System.out.println("enter try again");
            System.out.println(test.value);
            try{
                int i = 200;
                int j =0;
                int result = i/j;
                System.out.println(result);

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Arithmetic prb");
            }
            System.out.println("outer try end");
        }catch (NullPointerException e){
            System.out.println("Test instance not created");
        }
    }
}
