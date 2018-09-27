package me.Blen;

import static jdk.nashorn.internal.objects.Global.print;

public class AnimalApp {
    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());

        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());

        Dog d = new Dog();
        print(d.sleep());
        print(d.eat());
        print(d.friend());
    }

    public static void print(String s) {
        System.out.println(s);
    }


}
