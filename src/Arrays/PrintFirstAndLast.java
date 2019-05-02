package Arrays;

public class PrintFirstAndLast {
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple", "note"};

        for (String word : words) {
            System.out.println(word.charAt(0) + word.charAt(word.length() - 1));

            // using a single println statement

            System.out.println();

            System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));

            // using substring

            for (String wrd : words) {
                System.out.println(word.substring(0,1) + word.substring(word.length() - 1));
            }

        }

    }
}
