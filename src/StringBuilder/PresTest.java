package StringBuilder;

public class PresTest {

    public static void main(String[] args) {

        String s1 = "Geeks";
        concat1(s1); // s1 is not changed
        System.out.println("String: " + s1);



    }

    public static void concat1(String s1)
    {
        s1 = s1 + "forgeeks";
    }


}
