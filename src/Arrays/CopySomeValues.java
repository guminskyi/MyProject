package Arrays;

public class CopySomeValues {
    public static void main(String[] args) {

        //String[] words = {"remote", "local", "bread", "cell", "brain", "keys"};

        String[] arr = {"zero", "one", "two", "three", "four"};

        // count how many words contain "e"

        int counter = 0;
        for(String str : arr) {
            if(str.contains("e")) {
                counter++;
            }
        }

        System.out.println(counter);

        // create array fewValues with size of counter

        String[] fewValues = new String[counter];

        // go over arr one more time, and add the words with "e" into fewValues

        int i = 0;

        for (String eWords : arr) {
            if(eWords.contains("e")) {
                fewValues[i] = eWords;
                i++;
            }
        }

        for (String val : fewValues) {
            System.out.print(val + " ");
        }

    }
}
