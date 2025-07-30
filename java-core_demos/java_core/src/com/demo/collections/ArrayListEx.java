package com.demo.collections;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args){
        rawTypes();
        genericTypes();
    }

    private static void rawTypes(){

        ArrayList colorsList =  new ArrayList();
        colorsList.add("red");
        colorsList.add(null);
        colorsList.add("Green");
        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        colorsList.add(arithmeticException);
        System.out.println(colorsList);
    }

    private static void genericTypes() {

        ArrayList<String> colorsList =  new ArrayList<String>();
        colorsList.add("red");
        colorsList.add(null);
        colorsList.add("Green");
        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        //colorsList.add(arithmeticException);
        colorsList.add("blue");
        System.out.println(colorsList);

        ArrayList<Integer> IntegerList =  new ArrayList<Integer>();
        IntegerList.add(30);
        IntegerList.add(12);
        IntegerList.add(3);
        IntegerList.add(null);
        System.out.println(IntegerList);

        ArrayList<Number> numberList =  new ArrayList<Number>();
        numberList.add(30);
        numberList.add(12);
        numberList.add(3);
        numberList.add(null);
        System.out.println(numberList);
    }
}
