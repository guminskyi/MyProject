package Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String words = "java-selenium-cucumber-testing-junit-eclipse-maven-git-github";

        String[] splittedWords = words.split("-");

        System.out.println(splittedWords.length);
        System.out.println(splittedWords[0]);

        for (String each : splittedWords) {
            System.out.print(each + " ");
        }

        System.out.println();

        String searchResults = "All categories wooden spoon 13,623 results.";

        // if you have a sentence as a string, how do you find out how many words is there in it?

        String[] wrds = searchResults.split(" ");

        System.out.println("Word count: " + wrds.length);

        System.out.println("Word count: " + searchResults.split(" ").length);

        // extract number of wooden spoon results and print out

        System.out.println("Wooden spoon count: " + wrds[4]);



    }
}
