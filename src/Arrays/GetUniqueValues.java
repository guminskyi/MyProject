package Arrays;

public class GetUniqueValues {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,2,3,4,44,12,20,100,33,100,4};

        // take a num from array
        // compare with the rest of nums in an array
        // if it's unique - print it out

        // take a num from array
        // create var counter and assign to it. int counter = 0
        // compare the num with all other nums (don't compare with itself)
        // if match found - counter++, if not - don't touch counter
        // if counter is still 0, print that num bc it's unique

        for(int outer = 0; outer < nums.length; outer++) {

            int currentNum = nums[outer];
            boolean duplicate = false;

            for (int inner = 0; inner < nums.length; inner++) {

                if(nums[inner] == currentNum && outer != inner) {
                    duplicate = true;
                    break;
                }
            }

            if(duplicate == false) {
                System.out.println(currentNum);
            }

        }

    }
}
