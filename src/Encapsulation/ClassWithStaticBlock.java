package Encapsulation;

public class ClassWithStaticBlock {
    static {
        System.out.println("This is static Block. I run once in the beginning");
    }

    public ClassWithStaticBlock() {
        System.out.println("This is a constructor. I run every time object is created");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }

}
