package Arrays;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Arrays.deepToString;

public class ReturnR {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        Random random = new Random();

        nums.add(random.nextInt(6));
        nums.add(random.nextInt(6));
        nums.add(random.nextInt(6));
        nums.add(random.nextInt(6));
        nums.add(random.nextInt(6));

        System.out.println(deepToString(ReturnR(nums)));

    }

    public static ArrayList<Integer> shuffle(ArrayList<Integer> nums) {

        Random random = new Random();

//        arr = new int[]{random.nextInt(6), random.nextInt(6),
//                random.nextInt(6), random.nextInt(6), random.nextInt(6)};

          ArrayList<Integer> newNums = new ArrayList<>();
          newNums.addAll(nums);

        for(int i = 0; i < nums.size() - 1; i++) {

            Integer temp = newNums.get(random.nextInt(newNums.size())) ;
            nums.set(i, temp);
            newNums.remove(Integer.valueOf(temp));

        }

        nums.set(nums.size() - 1, newNums.get(0));

        return nums;

    }

    public static ArrayList<Integer> isSort(ArrayList<Integer> arrList) {

        ArrayList <Integer> newArrList = new ArrayList<>();
        Collections.sort(arrList);
        newArrList.addAll(arrList);
        return arrList;

    }

    public static int[][] ReturnR (ArrayList<Integer> arrList) {

        int count = 0;

        int[] arrListToArr = new int[arrList.size()];

        for(int i = 0; i < arrListToArr.length; i++) {
            arrListToArr[i] = arrList.get(i);
        }

        int[][] arr = { {count}, arrListToArr };

        ArrayList<Integer> arrListSorted = isSort(arrList);

        do {

            shuffle(arrList);
            count++;

        } while(arrList != arrListSorted);

        return arr;

    }

}
