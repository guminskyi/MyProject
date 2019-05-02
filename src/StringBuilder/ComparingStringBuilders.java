package StringBuilder;

public class ComparingStringBuilders {

    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder("java");
        StringBuilder builder2 = new StringBuilder("java");

        System.out.println(builder1 == builder2); // false since both objs have diff. locations
        System.out.println(builder1.equals(builder2)); // false

        // to compare them, we convert to string, then call String's equals method

        System.out.println(builder1.toString().equals(builder2.toString()));

        StringBuilder builder3 = builder1;
        System.out.println(builder3 == builder1); // true
        System.out.println(builder3.equals(builder1)); // true

        builder3.append(" programming");



    }


}
