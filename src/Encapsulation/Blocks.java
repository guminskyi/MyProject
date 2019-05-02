package Encapsulation;

public class Blocks {
    static int num = 100;
    static String str;

    static {
        num += 1000;
        str = "Hello";
    }

    {
        num += 500;
        str += " world";
    }

    public Blocks() {
        num *= 2;
        str  += "!!!";
    }

    {
        System.out.println("init block");
        num += 500;
        str += " world";
    }

}
