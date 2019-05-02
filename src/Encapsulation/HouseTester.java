package Encapsulation;

public class HouseTester {

    public static void main(String[] args) {

        // 1. Create House obj and assign data to fields/instances

        House yourHouse = new House();
        yourHouse.type = "Castle";
        yourHouse.address = "100 Castle Rd";
        yourHouse.bedroom = 250;
        yourHouse.year = 1861;

        // 2. Pass your house obj to printHouseInfo method

        printHouseInfo(yourHouse);

        House hisHouse = new House();
        hisHouse.type = "Condo";
        hisHouse.address = "30 Condo Rondo Hwy";
        hisHouse.bedroom = 8;
        hisHouse.year = 2008;

        printHouseInfo(hisHouse);

        House returnHouse = buildAHouse("Apartment", "123 Main St Apt 1", 2, 2016);

        System.out.println(returnHouse.address);
        printHouseInfo(returnHouse);

    }

    public static void printHouseInfo(House houseObj) {
        System.out.println("====");
        System.out.println("Type: " + houseObj.type);
        System.out.println("Address: " + houseObj.address);
        System.out.println("Bedrooms #: " + houseObj.bedroom);
        System.out.println("Year: " + houseObj.year);
        System.out.println("====");
        System.out.println();
    }

    // method buildAHouse
    // args: 4 -> 2 strings / 2 ints
    // return type: House
    // In the method, using the values of the params build a new House object then return it

    public static House buildAHouse(String type, String address, int bedrooms, int year) {

        House perfectHouse = new House();
        perfectHouse.type = type;
        perfectHouse.address = address;
        perfectHouse.bedroom = bedrooms;
        perfectHouse.year = year;

        return perfectHouse;

    }

}
