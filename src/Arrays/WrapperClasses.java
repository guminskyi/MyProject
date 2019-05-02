package Arrays;

public class WrapperClasses {

    public static void main(String[] args) {

        System.out.println("Min byte: " + Byte.MIN_VALUE);
        System.out.println("Max byte: " + Byte.MAX_VALUE);

        Integer n1 = new Integer(100);
        Integer n2 = Integer.valueOf(100);
        Integer n3 = Integer.parseInt("2345");

        Double d1 = new Double (123.45);

        String str = "ab5c";
        System.out.println(Character.isAlphabetic(str.charAt(0)));
        System.out.println(Character.isUpperCase(str.charAt(0)));
        System.out.println(Character.isLetterOrDigit(str.charAt(0)));

    }

}
