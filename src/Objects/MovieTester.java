package Objects;

public class MovieTester {
    public static void main(String[] args) {

        // create 3 movies

        Movie internship = new Movie();
        Movie gladiator = new Movie();
        Movie starWars = new Movie();

        System.out.println(internship.name); // null
        System.out.println(internship.length); // 0

        internship.name = "Internship";
        gladiator.name = "Gladiator";
        starWars.name = "Star Wars";

        internship.length = 110;
        gladiator.length = 250;
        starWars.length = 3440;

        internship.watch();
        gladiator.watch();
        starWars.watch();

        internship.buy(10.77);
        gladiator.buy(23.20);
        starWars.buy(1.90);

    }
}
