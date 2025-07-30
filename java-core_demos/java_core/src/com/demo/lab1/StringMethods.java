package com.demo.lab1;

public class StringMethods {
    public static void main(String[] args){
        String str= "Niveditha Nayana";
        String str2= "niveditha nayana";
        String str3= "Java,Python,React";

        System.out.println("charAt(1): "+ str.charAt(1));

        System.out.println("contains(\"World\"): "+ str.contains("World"));

        System.out.println("length(): "+ str.length());

        System.out.println("indexOf(\"o\"): "+ str.indexOf("o"));

        System.out.println("equals(str2): "+ str.equals(str2));

        System.out.println("equalsIgnoreCase(str2): "+ str.trim().equalsIgnoreCase(str2));

        String joined= String.join("-", "Java","Python","React");
        System.out.println("join: "+ joined);

        System.out.println("lastIndexOf(\"1\"): "+ str.lastIndexOf("1"));

        System.out.println("substring(2,7): "+ str.substring(2,7));

        System.out.println("toLowerCase(): "+ str.toLowerCase());

        System.out.println("toUpperCase(): "+ str.toUpperCase());

        System.out.println("trim(): \""+ str.trim()+"\"");
    }
}
