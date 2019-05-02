package Encapsulation;

public class ClassWithInitBlock {

    {
        System.out.println("THIS IS INITIALIZER BLOCK. I RUN AUTOMATICALLY EVERY TIME OBJECT IS CREATED");
    }

    static {
        System.out.println("Static block. I run once before init or constructor. BUT ONCE ONLY");
    }

    public ClassWithInitBlock() {
        System.out.println("This is a constructor. I run every time object is created");
    }

    public static void staticMethod() {
        System.out.println("Static method");
    }

}
