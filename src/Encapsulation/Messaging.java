package Encapsulation;

public class Messaging {
    public static void main(String[] args) {

        Message msg1 = new Message("Hello", "Marufjan", "Akbar");
        Message msg2 = new Message("Java is fun");
        Message msg3 = new Message("This keyword is interesting", "Shahin");
        Message msg4 = new Message();

        System.out.println(msg1.toString());
        System.out.println(msg2.toString());
        System.out.println(msg3);
        System.out.println(msg4);

        StringBuilder stb = new StringBuilder("A");
        stb.append("B").append("C").append("D").insert(0, "J");

        System.out.println(stb);

    }
}
