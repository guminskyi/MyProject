package stringManipPractice;

import java.util.Scanner;

public class Strings03 {
    public static void main(String[] args) {

        System.out.println("Please enter the country name: ");

        Scanner scn = new Scanner(System.in);

        String countryName = scn.nextLine();

        String abbr = countryName.substring(0, 2).toUpperCase();

        System.out.println(abbr);

        String result = (abbr.length() == 2) ? "true" : "false";

        result = abbr.length() == 2 ?
                    abbr.charAt(0) == 'U' ? "Maybe USA" : "Not USA for sure" : "2 chars were not found";
        System.out.println(result);
    }
}
