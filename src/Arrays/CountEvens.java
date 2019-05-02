package Arrays;

public class CountEvens {
    public static void main(String[] args) {

        // count even nums in an array

        int[] nums = {2,1,2,3,4};

        int count = 0;

        for (int n : nums) {
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
