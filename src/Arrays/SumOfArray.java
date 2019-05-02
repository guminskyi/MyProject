package Arrays;

public class SumOfArray {
    public static void main(String[] args) {

        // create array nums - assign several values
        // using a loop, calculate the sum and print it
        // calculate odd and even nums separately

        int[] nums = {1,2,3,4,5,6};
        int sum = 0;
        int sumOdd = 0;
        int sumEven = 0;

        for(int n : nums) {
            sum += n;

            if (n % 2 == 1) {
                sumOdd += n;
            } else {
                sumEven += n;
            }

        }

//        for (int i = 0; i < nums.length; i++) {
//
//            sum += nums[i];
//
//            if (nums[i] % 2 == 1) {
//                sumOdd += nums[i];
//            } else {
//                sumEven += nums[i];
//            }
//        }

        System.out.println("Sum of all nums is: " + sum);
        System.out.println("Sum of odd nums is: " + sumOdd);
        System.out.println("Sum of even nums is: " + sumEven);

    }
}
