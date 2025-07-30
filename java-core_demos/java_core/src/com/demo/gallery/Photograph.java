package com.demo.gallery;

public class Photograph {
    byte frameWidth;
    String colorPhoto;
    String frameMaterial;
    String name;

    void hang() {
        System.out.println("hang on rare wall");
    }

    void changeOrientation(String Orientation){
        System.out.println("Orientation changes to" + Orientation);
    }

    boolean illumination(){
        System.out.println("illumination");
        return true;
    }

    void autograph(){
        System.out.println("signed");
    }
}
