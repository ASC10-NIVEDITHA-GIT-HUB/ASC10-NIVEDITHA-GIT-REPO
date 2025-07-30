package com.demo.inheritance;

public class StaticPolymorphismEx {
    public static void main(String[] args){
        Movie freeSolo= new Movie();
        freeSolo.play();
        freeSolo.play("english");
    }
}

class Movie {
    public void play(){
        System.out.println("Playing Movie");
    }
    public void play(String subtitle){
        System.out.println("playing with subtitle" +  subtitle);
    }

}
