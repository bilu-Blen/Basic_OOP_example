package me.Blen;

public class Bird extends Animal {
    public Bird(){
        //super();
        System.out.println("A bird is hatched..");
    }

    @Override
    public String sleep(){
        return "A bird sleeps soundly...";
    }

    @Override
    public String eat(){
        return "A bird eats..";
    }



}
