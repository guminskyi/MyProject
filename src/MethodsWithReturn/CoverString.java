package MethodsWithReturn;

import java.util.Arrays;

public class CoverString {

    public static void main(String[] args) {

        System.out.println(CoverString("I love me some mellow meals", "me"));

    }

    public static String CoverString(String big, String coverMe) {

        String coverMeNew = "[" + coverMe + "]";

        for(int i = 0; i < big.length(); i++) {

            if (big.contains(coverMe)) {
                String bigNew = big.replace(coverMe, coverMeNew);
                return bigNew;
            } else {
                big = "[" + big + "]";
                return big;
            }

        }

        return "me";

    }

}
