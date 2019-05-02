package Encapsulation;

public class CalcBuilder {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(10);
        a.setY(5);

        a.minus();
        System.out.println(a.getResult());

        a.plus();
        System.out.println(a.getResult());

    }
}
