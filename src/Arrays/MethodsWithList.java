package Arrays;

import java.util.ArrayList;
import java.util.Random;

public class MethodsWithList {
    public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);

       int result = sumList(numbers);
       System.out.println(result);

       // * * *

       ArrayList<Integer> list1 = new ArrayList<>();
       list1.add(100);
       list1.add(200);

       ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(300);
       list2.add(400);

       int result2 = Sum2Lists(list1, list2);
       System.out.println(result2);

       // * * *

       System.out.println(IntList(10));

    }

    // how to write a method that accepts on arraylist
    // calculate the sum of values and return it

    public static int sumList(ArrayList<Integer> nums) {

        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        return sum;
    }

    // method sum2Lists
    // args: 2 Integer arrayLists
    // return int
    // sum of both ALs

    public static int Sum2Lists(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        int sum2 = 0;

        for(int k = 0; k < list1.size(); k++) {
            sum2 += list1.get(k) + list2.get(k);
        }

        return sum2;
    }

    // method buildIntList
    // return AL of ints
    // args: int

    // this method gets an int and creates an AL with that many random nums 0-100 and returns it

    public static ArrayList<Integer> IntList(int number) {

        Random random = new Random();

        ArrayList<Integer> newList = new ArrayList<>(number);

        for(int n = 0; n < number; n++) {
            newList.add(random.nextInt(101));
        }

        return newList;

    }

}
