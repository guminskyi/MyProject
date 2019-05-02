package Arrays;

public class ArrayLength {
    public static void main(String[] args) {

        // declare array names that can store 5 names

        String[] names = new String[5];
        names[0] = "Serik";
        names[1] = "Sarah";
        names[2] = "Elton";
        names[3] = "Michael";
        names[4] = "Jon";

        System.out.println(names.length); // counting the values in the array

        String name = names[3];
        System.out.println(name.length()); // counting chars in the string

    }
}
