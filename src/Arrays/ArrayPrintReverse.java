package Arrays;

public class ArrayPrintReverse {
    public static void main(String[] args) {

        // create int array points and assign 10 different scores between 0 and 100

        int[] points = new int[]{56, 23, 1, 19, 81, 77, 10, 4, 21, 3};

        // check if 10

        if(points.length == 10) {
            System.out.println("10 points found");
        } else {
            System.out.println("Need 10 points");
        }

        // using a for loop, print each element in reverse order, separated by space
        // while loop -> reverse order, same line, separated by space

        for (int i = points.length - 1; i >= 0; i--) {
            System.out.print(points[i] + " ");
        }

        System.out.println("");

        int j = points.length - 1;
        while (j >= 0) {
            System.out.print(points[j] + " ");
            j--;
        }

        System.out.println("");

        for (int p : points) {
            System.out.print(p + " ");
        }


    }
}
