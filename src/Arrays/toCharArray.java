package Arrays;

public class toCharArray {
    public static void main(String[] args) {

        String word = "hello";
        char[] letters = word.toCharArray();

       for (char letter : letters) {
           System.out.print(letter + " ");
       }

        System.out.println();

        String gift = "Diamond Ring";
       // convert to charArray and print reverse

        char[] diamondletters = gift.toCharArray();

        for (int i = diamondletters.length - 1; i >= 0; i--) {
            System.out.print(diamondletters[i] + " ");
        }

    }
}
