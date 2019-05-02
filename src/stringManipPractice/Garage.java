package stringManipPractice;

public class Garage {
    public static void main(String[] args) {

        String garage = "Toyota, Nissan, Honda, BMW, Maserati, Ford".toLowerCase();

        if (garage.isEmpty()) {
            System.out.println("no cars in the garage");
        }
        if (garage.contains("toyota") || garage.contains ("nissan") || garage.contains("honda")) {
                System.out.println("there are japanese cars in the garage");
        }
        if (garage.contains ("bmw")) {
                System.out.println("there are german cars in the garage");
        }
        if (garage.contains ("maserati")) {
                System.out.println("there are italian cars in the garage");
        }
        if (garage.contains ("ford")) {
                System.out.println("there are american cars in the garage");
        }
        else {
                System.out.println("there's no good cars in the garage");
        }
    }
}
