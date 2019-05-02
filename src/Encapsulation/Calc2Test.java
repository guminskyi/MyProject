package Encapsulation;

public class Calc2Test {
    public static void main(String[] args) {

        Calc2 c = new Calc2();
        c.plus(10);
        System.out.println(c.getResult());

        c.plus(5).plus(15).plus(10).minus(18);
        System.out.println(c.getResult());

    }
}
