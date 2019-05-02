package Arrays;

public class SearchInArray {
    public static void main(String[] args) {

        // create array nums and assign 10 different nums to it
        // search for a number 100 in it using a for loop, once found, print the index
        // "location and value found at index " + index
        // if that search value is not found, print "100 not found in the array"

        int[] nums = {1,3,5,7,9,11,13,15,17,100};
        int lookfor = 100;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == lookfor) {
                System.out.println(lookfor + " was found at index " + i);
                found = true;
                break;
            }

        }

        if(found == false) {
            System.out.println(lookfor + " not found in the array");
        }

    }
}
