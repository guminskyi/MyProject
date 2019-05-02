package StringBuilder;

public class SBTasks {

    public static void main(String[] args) {

        String[] arr = {"a", "b", "c"};
        System.out.println(arrayToSb(arr));

        StringBuilder stb = new StringBuilder();
        stb.append("false,true");
        System.out.println(ToBe(stb));

        String[] arr2 = {"abc", "foo bar", "123"};
        int size = 5;
        System.out.println(trim_posts(arr2, size));

    }

    public static StringBuilder arrayToSb (String[] arr2) {

        StringBuilder abc = new StringBuilder();

        for(String str : arr2) {
            abc.append(str);
        }

        return abc;

    }

    public static boolean ToBe(StringBuilder stb) {

        String str = stb.toString();
        String[] arr = str.split(",");
        boolean found = false;

        for(String word : arr) {
            if (word.equals("true")) {
                found = true;
                return found;
            }
        }
        return found;
    }

    public static StringBuilder trim_posts(String[] r, int size) {

        StringBuilder text = new StringBuilder();

        for(String word : r) {
            if(word.length() <= size) {
                text.append(word + "<br>");
            } else {
                continue;
            }
        }
        return text;
    }

}
