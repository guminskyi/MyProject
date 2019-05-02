package Encapsulation;

public class AttsBuilder {
    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "Toyota";
        a.color = "black";
        a.amount = 1;

        System.out.println(asString(a));

        System.out.println();

        Atts b = new Atts();
        b.setCar2("Honda");
        b.setColor2("white");
        b.setAmount2(5);

        System.out.print(b.getCar2() + " | " + b.getColor2() + " | " + b.getAmount2());

    }

    public static String asString(Atts a) {
        String str = a.name + " | " + a.color + " | " + a.amount;
        return str;
    }
}




