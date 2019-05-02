package Arrays;

public class Tasks {
    public static void main(String[] args) {

        String[] arr = {"apples", "banana", "kiwi", "cherries"};

        for(String fruit : arr) {
            System.out.println(fruit.substring(0,3));
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(0,3));
        }

    }
}
