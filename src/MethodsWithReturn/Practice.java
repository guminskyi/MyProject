package MethodsWithReturn;

public class Practice {

    // method countTimes
    // params: 2 Strings
    // Return type: int
    // Count number of occurences of first string within second string
    // and return that count

    // Ex. countTimes("java", "a") -> 2

    public static void main(String[] args) {

        System.out.println(countTimes("Break time is over!", "e"));
        System.out.println(countTimesV2("Break time is over!", "e"));
        System.out.println(countTimesV3("Break time is over!", "e"));

    }

    public static int countTimes(String main, String secondary) {

        int count = 0;

        for(int i = 0; i < main.length(); i++) {

            if(main.substring(i,i+1).equals(secondary)) {
                count++;
            }

        }

        return count;

    }

    public static int countTimesV2(String big, String little) {

        String[] arr = big.split(little);
        return arr.length - 1;

    }

    public static int countTimesV3(String big, String little) {

        int len1 = big.length();
        big = big.replace(little, "");
        int len2 = big.length();
        return len1 - len2;

    }

}
