package Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int f = getSecondLargestNumber(new int[]{120, 43, 13, 6});
        System.out.println(f);

    }

        public static int getSecondLargestNumber(int[] arr) {

            int max = 0, secondMax = 0;

            for(int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                }

                else if(arr[i] > secondMax && max != arr[i]) {
                    secondMax = arr[i];
                }

            }

            return secondMax;

        }

    }

