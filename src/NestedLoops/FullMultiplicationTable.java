package NestedLoops;

public class FullMultiplicationTable {

    public static void main(String[] args) {

        /* Declare and initialize primitive variables */
        int result;

        /* Header */
        // First, print some space
        System.out.print("    ");

        // Then, print numbers from 1 to 9 across the top
        for (int j = 1; j <= 9; j++) {
            System.out.print("    " + j);
        }
        System.out.println();

        /* Separator */
        // Print a dashed line
        for (int j = 1; j < 50; j++) {
            System.out.print("-");
        }
        System.out.println();

        /* Values */
        // Outer loop: multipliers
        for (int outer = 1; outer <= 9; outer++) {
            System.out.print(outer + " | ");

            // Inner loop: values
            for (int inner = 1; inner <= 9; inner++) {

                // Calculate the value
                result = outer * inner;

                // Format the output
                if (result < 10) {

                    // Here, we need an extra space if the result is 1 digit
                    System.out.print("    " + result);
                }
                else {
                    System.out.print("   " + result);
                }

            }	// End for inner

            System.out.println();

        }	// End for outer

    }
}