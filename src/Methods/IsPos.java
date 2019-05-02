package Methods;

public class IsPos {

    public static void main(String[] args) {

        int[] nums = {9,8,-2,0};
        isPos(nums);

    }

    public static void isPos(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Not positive");
            }
        }

    }

}
