package Arrays;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Los Angeles");
        cities.add("Seattle");
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Portland");

        int count = 0;

        for(int i = 0; i < cities.size(); i++) {
            cities.get(i);
            count++;
        }

        System.out.println("The number of cities you entered is: " + count);

        String awesomeCities = "";
        String badCities = "";

        for(int j = 0; j < cities.size(); j++) {

//            cities.get(j).toLowerCase();

            if(cities.get(j).charAt(0) == 'L' || cities.get(j).charAt(0) == 'S') {
                awesomeCities += cities.get(j) + ", ";
            } else {
                badCities += cities.get(j) + ", ";
            }

        }

        awesomeCities = awesomeCities.substring(0, awesomeCities.length() - 2) + ".";
        badCities = badCities.substring(0, badCities.length() - 2) + ".";

        System.out.println("Awesome cities are: " + awesomeCities);
        System.out.println("Bad cities are: " + badCities);

    }

}
