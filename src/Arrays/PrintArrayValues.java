package Arrays;

public class PrintArrayValues {
    public static void main(String[] args) {

        // create an array cars and directly assign following values:
        // Audi, Lotus, Pagani, Tesla, Porsche, Dodge, Jaguar

        String[] cars = {"Audi", "Lotus", "Pagani", "Tesla", "Porsche", "Dodge", "Jaguar"};

        // print number of cars

        System.out.println(cars.length);

        int i = 0;
        System.out.println(cars[i]);
        i++; i++; i++;
        System.out.println(cars[i]);

        // print all values using for loop

        for (int j = 0; j < cars.length; j++) {
            System.out.println(cars[j]);
        }

        // print all values using For Each loop
        for(String car : cars) {
            System.out.println(car);
        }


    }
}
