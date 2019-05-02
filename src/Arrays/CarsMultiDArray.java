package Arrays;

import java.util.Arrays;

public class CarsMultiDArray {
    public static void main(String[] args) {

        //  create a 2D array cars
        // it should have 4 groups of cars
        // 1. Japanese
        // 2. German
        // 3. American
        // 4. Italian

        String[][] cars = new String[][]{ {"Honda", "Nissan", "Toyota"},
                                        {"BMW", "Mercedes", "Porsche"},
                                        {"Ford", "Chevy", "Dodge"},
                                        {"Lambo", "Ferrari", "Alfa Romeo"} };


        // 1. using for loop
        // - outer loop -> 0 to cars.length
        // - inner loop -> 0 to cars[i].length and access cars

        for (int i = 0; i < cars.length; i++) {

            switch(i) {
                case 0:
                    System.out.print("Japanese: ");
                    break;
                case 1:
                    System.out.print("German: ");
                    break;
                case 2:
                    System.out.print("American: ");
                    break;
                case 3:
                    System.out.print("Italian: ");
                    break;
                default:
                    System.out.print("Unknown group");
            }

//            if(i == 0) {
//                System.out.print("Japanese: ");
//            }
//            if (i == 1) {
//                System.out.print("German: ");
//            }
//            if (i == 2) {
//                System.out.print("American: ");
//            }
//            if (i == 3) {
//                System.out.print("Italian: ");
//            }

            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 2. using for each loop (enhanced for loop)

        for (String[] carGroups : cars) {
            for(String car : carGroups) {
                System.out.print(car + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (String[] carGroups : cars) {
            System.out.print(Arrays.toString(carGroups));
        }

        System.out.println();

        System.out.println(Arrays.deepToString(cars));
    }
}
