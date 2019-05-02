package MethodsWithReturn;

public class AFooBarFooBla {

    public static void main(String[] args) {

        String[] someArray = {"a", "foo", "bar", "foo", "bla"};
        System.out.println(AFooBarFooBla(someArray, "foo"));

    }

    public static int AFooBarFooBla(String[] someArray, String someString) {

        int howMany = 0;

        for(int i = 0; i < someArray.length; i++) {

            if(someArray[i].equals(someString)) {
                howMany++;
            }

        }

        return howMany;

    }

}
