package me.Blen;

public class Dog extends Animal {

    @Override
    public String sleep(){
        return "A dog sleeps for a LONG TIME ";
    }

    @Override
    public String eat(){
        return "Dogs eat a lot";
    }

    public String friend(){
        return "Dogs are good friends for humans";
    }

}
