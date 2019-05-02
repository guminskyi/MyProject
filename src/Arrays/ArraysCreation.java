package Arrays;

import java.util.Arrays;

public class ArraysCreation {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // declaring array that can hold 5 items
        numbers[0] = 1; // assigning values
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(numbers[0]); // read from array
        System.out.println(numbers[3]);

        numbers[0] = 1000; // reassigning values
        System.out.println(numbers[0]); // idx[0] == 1000

        numbers[1] = numbers[2] + numbers[3]; // totally acceptable bc the datatype is the same, reassigns [1]
        System.out.println(numbers[1]);

        char[] grades = {'A', 'B', 'C', 'D', 'E'};
        char[] grades2 = new char[]{'A', 'B', 'C', 'D', 'E'};

        System.out.println(grades[0]);

        char myGrade = grades[1];
        System.out.println(myGrade);

        // String[] cities = new String[3];
        String[] cities;
        cities = new String[3];

        cities[0] = "NY";
        cities[1] = "LA";
        cities[2] = "MI";

        /*String cities2;  // won't work
        cities2 = {"Chicago, Toronto, Montreal"};*/

        String[] cities2 = {"Chicago, Toronto, Montreal"};
        System.out.print(Arrays.toString(cities2));

    }
}
