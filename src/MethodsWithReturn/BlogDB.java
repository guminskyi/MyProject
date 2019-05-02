package MethodsWithReturn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlogDB {

    public static void main(String[] args) {

        List<String[]> r = new ArrayList<>();
        String[] arr = {"1", "title", "content"};
        r.add(arr);
        String[] arrNew = new String[2];
        String id = "1";

        BlogDB(r, id, arrNew);

        System.out.println(Arrays.toString(arrNew));

    }

    public static void BlogDB(List<String[]> r, String id, String[] arrNew) {

        int k = 0;

        for(int i = 0; i < r.size(); i++) {

                if(r.get(i)[0].equals(id)) {

                    for(int j = 1; j < r.get(i).length; j++) {
                        arrNew[k] = r.get(i)[j];
                        k++;
                    }

                }

        }

    }

}
