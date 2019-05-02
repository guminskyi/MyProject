package Encapsulation;

public class BlocksTest {
    public static void main(String[] args) {

        System.out.println(Blocks.num);
        System.out.println(Blocks.str);

        System.out.println();

        System.out.println(Blocks.num);
        System.out.println(Blocks.str);

        System.out.println();

        Blocks b1 = new Blocks();
        Blocks b2 = new Blocks();

        System.out.println(b1.num);
        System.out.println(b1.str);

        System.out.println();

        System.out.println(b2.num);
        System.out.println(b2.str);

    }
}
