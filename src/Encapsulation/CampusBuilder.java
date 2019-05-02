package Encapsulation;

public class CampusBuilder {
    public static void main(String[] args) {

        Campus.city = "McLean";
        Campus.aboutCampus();

        Campus c = new Campus();
        System.out.println(c.city);
        c.aboutCampus();

    }
}
