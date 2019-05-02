package Arrays;

public class MaxMirror {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 8, 9, 3, 2, 1, 0, 1, 2, 1, 0};

        System.out.println(maxMirror(nums));

    }

    public static int maxMirror(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if(nums[i + count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
