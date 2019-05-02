package StringBuilder;

public class ReplaceWith {

    public static void main(String[] args) {

        String[] arr = {"a","b","a","b","c"};
        String a = "a";
        String b = "b";

        System.out.println(ReplaceWith(arr,a,b));

    }

    public static StringBuilder ReplaceWith(String[] arr, String a, String b) {

        StringBuilder replaced = new StringBuilder();

        for(String word : arr) {
            if(word.equalsIgnoreCase(a)) {
                word = word.replace(a,b);
            }
            replaced.append(word);
        }

        return replaced;

    }

}
