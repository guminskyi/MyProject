package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineRS {
    public static void main(String[] args) {

        String[] str1 = {"f", "o", "o"};
        String[] str2 = {" b", "a", "r"};

        System.out.println(combined(str1, str2));

    // ["f", "o", "o"], ["b", "a", "r"];
    // return foo bar

    // String[][] foobar = { {"f", "o", "o"}, {"b", "a", "r"} };
    // ArrayList<String> foobarList = new ArrayList<>();

    }

    public static String combined(String[] str1, String[] str2) {

      String ret = "";
      ArrayList<String> arrL = new ArrayList<>();

      List<String> temp1 = Arrays.asList(str1);
      List<String> temp2 = Arrays.asList(str2);
      arrL.addAll(temp1);
      arrL.addAll(temp2);

      for(String word : arrL) {
          ret += word;
      }

      return ret;

    }

}
