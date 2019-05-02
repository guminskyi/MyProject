package Arrays;

import java.util.*;

public class ArrayListWarmUp {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Lviv");
        cities.add("Ivano-Frankivsk");
        cities.add("Lutsk");
        cities.add("Kyiv");
        cities.add("Washington");
        cities.add("New York");
        cities.add("Budapest");

        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            cities.get(i);
            count++;
        }

        System.out.println("The number of cities you entered is: " + count + ".");

        String longCityName = "";

        for (int i = 0; i < cities.size(); i++) {

            if (cities.get(i).length() >= 7)
                longCityName += cities.get(i) + ", ";

        }
        longCityName = longCityName.substring(0,longCityName.length() - 2) + ".";
        System.out.println("The cities with 7 and more characters are: " + longCityName);

        ArrayList<String> longNames = new ArrayList<>();
        longNames.add("Rio de Janeiro");
        longNames.add("Barcelona" );
        longNames.add("Ibiza");

        longNames.clear();

        System.out.println(longNames.isEmpty() + " " + (longNames.size() == 0));

        for(int idx = 0; idx < cities.size(); idx++) {
            String city = cities.get(idx);

            if(city.length() > 6) {
                // longNames.add(city);
                longNames.add(cities.get(idx));
            }

        }

        System.out.println("Cities count with 6 or more chars: " + longNames.size());
        System.out.println(longNames.toString());

    }

}


