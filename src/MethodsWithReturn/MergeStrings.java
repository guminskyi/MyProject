package MethodsWithReturn;

public class MergeStrings {

    public static void main(String[] args) {

        System.out.println(MergeStrings("zebra", "tiger."));

    }

    public static String MergeStrings(String s1, String s2) {

        String merged = "";

        if(s1.length() > s2.length()) {

            for(int i = 0; i < s2.length(); i++) {
                merged += s1.charAt(i);
                merged += s2.charAt(i);
            }

            merged += s1.substring(s2.length());

        }

        if(s2.length() > s1.length()) {

            for(int i = 0; i < s1.length(); i++) {

                merged += s1.charAt(i);
                merged += s2.charAt(i);

            }

            merged += s2.substring(s1.length());

        }

        if(s1.length() == s2.length()) {

            for(int i = 0; i < s2.length(); i++) {

                merged += s1.charAt(i);
                merged += s2.charAt(i);

            }

        }

        return merged;

    }

}
