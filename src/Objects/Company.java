package Objects;

public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.firstName = "Mike";
        emp1.lastName = "Smith";
        emp1.email = emp1.firstName + emp1.lastName + "gmail.com";
        emp1.position = "Scrum master";
        emp1.salary = 65.5;

        emp2.firstName = "John";
        emp2.lastName = "Smith";
        emp2.email = emp1.firstName + emp1.lastName + "gmail.com";
        emp2.position = "SDET";
        emp2.salary = 45.5;

    }
}
