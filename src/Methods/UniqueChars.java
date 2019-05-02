package Methods;

public class UniqueChars {

    public static void main(String[] args) {

        System.out.println(UniqueChars("spoon"));

    }

    public static String UniqueChars(String word) {

        String unique = "";

        for(int i = 0; i < word.length(); i++) {
            if(unique.indexOf(word.charAt(i)) == -1) {
                unique += word.charAt(i);
            }
        }

        return unique;

    }

}
