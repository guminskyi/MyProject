package Arrays;

public class Matrix0101 {
    public static void main(String[] args) {

      String[] arr = {"a", "d", "2", "4"};

      for (int i = 0; i < arr.length; i++) {
          if (i % 2 == 0) {
              arr[i] = "0";
          } else {
              arr[i] = "1";
          }
          System.out.print(arr[i] + " ");
      }

    }
}
