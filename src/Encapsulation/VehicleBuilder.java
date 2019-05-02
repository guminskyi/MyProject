package Encapsulation;

public class VehicleBuilder {
    public static void main(String[] args) {

        Vehicle car1 = new Vehicle();
        car1.setType("coupe");
        car1.setMake("Honda");
        car1.setModel("Accord");
        car1.setSpeed(120);

        System.out.println("Type: " + car1.getType());
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Speed: " + car1.getSpeed());

        car1.accelerate(30);
        System.out.println("New speed: " + car1.getSpeed());

//        Vehicle car2 = new Vehicle("coupe", "Ford", "Mustang");
//        System.out.println("Car 2" + car2.getType() + " " + car2.getMake() + " " + car2.getModel());



    }
}
