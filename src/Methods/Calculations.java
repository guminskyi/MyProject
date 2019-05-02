package Methods;

public class Calculations {
    public static void main(String[] args) {

        // add 1234 + 400 using add method of Calculator class

        Calculator.add(1234,400);

        // we are mentioning the class name bc divide method isn't in the same class

        Calculator.divide(500,100);

        // if we try using it with a class in different package , it wont' work. We have to import it

    }
}
