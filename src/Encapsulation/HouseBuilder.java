package Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseBuilder {
    public static void main(String[] args) {

        House house1 = new House();
        house1.bedroom = 3;
        house1.type = "Townhouse";
        house1.address = "123 Main St";
        house1.year = 2010;

        House house2 = new House();
        house2.bedroom = 2;
        house2.type = "Apartment";
        house2.address = "456 Lee Hwy Apt 22";
        house2.year = 2014;

        House house3 = new House();
        house3.bedroom = 2;
        house3.type = "Condo";
        house3.address = "789 NW St";
        house3.year = 2012;

        System.out.println("House1 type: " + house1.type);
        System.out.println("House2 type: " + house2.type);
        System.out.println("House3 type: " + house3.type);

        int[] nums = new int[4];
        nums[0] = 234;

        String[] names = new String[4];
        names[0] = "Bill";

        House[] houses = new House[3];
        houses[0] = house1;
        houses[1] = house2;
        houses[2] = house3;

        System.out.println(houses[0].address);

        System.out.println();

        for(int i = 0; i < houses.length; i++) {
            System.out.println(houses[i].address);
        }

        for(House h : houses) {
            System.out.println(h.type + "=>" + h.address);
        }

        System.out.println();

        // System.out.println(===AL OF HOUSE OBJS===);

        ArrayList<Integer> numsList = new ArrayList<>();

        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        ArrayList<House> houseList2 = new ArrayList<>(Arrays.asList(houses));
        List<House> houseList3 = Arrays.asList(houses); // fixed sized AL

        // print the year of each house if it was built within

        for(int j = 0; j < houseList.size(); j++) {

            if (houseList.get(j).year >= 2010 && houseList.get(j).year <= 2012) {
                System.out.println(houseList.get(j).year + " | " + houseList.get(j).address);
            }

        }

        for(House house : houseList) {

            if(house.year >= 2010 && house.year <= 2012) {
                System.out.println(house.year + " | " + house.address);
            }

        }

    }

    public static void printHouseInfo(House houseObj) {
        System.out.println("====");
        System.out.println("Type: " + houseObj.type);
        System.out.println("Address: " + houseObj.address);
        System.out.println("Bedrooms #: " + houseObj.bedroom);
        System.out.println("Year: " + houseObj.year);
        System.out.println("====");
    }

}
