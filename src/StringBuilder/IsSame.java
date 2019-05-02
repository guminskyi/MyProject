package StringBuilder;

public class IsSame {

    public static void main(String[] args) {

        String a = "a";
        StringBuilder b = new StringBuilder("a");

        System.out.println(IsSame(a,b));

    }

    public static boolean IsSame(String a, StringBuilder b) {

        if(a.equals(b.toString())) {
            return true;
        } else {
            return false;
        }

    }

}
