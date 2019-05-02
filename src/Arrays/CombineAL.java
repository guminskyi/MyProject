package Arrays;

import java.util.ArrayList;

public class CombineAL {

    public static void main(String[] args) {

        ArrayList<String> wordlist1 = new ArrayList<>();
        wordlist1.add("Me");
        wordlist1.add("You");
        wordlist1.add("Them");

        ArrayList<String> wordlist2 = new ArrayList<>();
        wordlist2.add("Bike");
        wordlist2.add("Surf");
        wordlist2.add("Walk");

        System.out.println(combined(wordlist1, wordlist2));

    }

    public static ArrayList<String> combined (ArrayList<String> wordlist1, ArrayList<String> wordlist2) {

        ArrayList<String> combinedAL = new ArrayList<>(wordlist1.size() + wordlist2.size());

        combinedAL.addAll(wordlist1);
        combinedAL.addAll(wordlist2);

        return combinedAL;

    }

}
