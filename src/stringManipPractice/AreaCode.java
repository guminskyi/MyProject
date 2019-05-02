package stringManipPractice;

import java.util.Scanner;

public class AreaCode {
    public static void main(String[] args) {

        System.out.println("Please enter a phone number: ");

        Scanner scn = new Scanner(System.in);

        String num = scn.nextLine();
        String code;
        String state = "";

        if (num.startsWith("(")) {
            code = num.substring(1,4);
        }
        else {
            code = num.substring(0, 3);
        }

        switch (code) {
                case "202":
                    state = "DC";
                    break;
                case "703":
                    state = "VA";
                    break;
                case "209":
                    state = "CA";;
                    break;
                case "312":
                    state = "IL";;
                    break;
                case "347":
                    state = "NY";
                    break;
                default:
                    state = "Not in database";
        }

        System.out.println(state);

    }
}
