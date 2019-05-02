package Objects;

// Movie is just a template with 2 vars and a method. It doesn't run by itself

public class Movie {
    String name;
    int length;

    public void watch() {
        System.out.println("Watching " + name);
        System.out.println("It is " + length + " minutes");
    }

    public void buy(double price) {
        System.out.println("Buying " + name + " for $ " + price);
    }

}
