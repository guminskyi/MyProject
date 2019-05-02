package Encapsulation;

public class PersonBuilder {
    public static void main(String[] args) {

        Person person1 = new Person();
//        person1.setFirstName("Mike");
//        person1.setLastName("Smith");
//        person1.setAge(21);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.personInfo());

        System.out.println();

        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setAge(44);
        System.out.println(person1.personInfo());

        System.out.println();

        Person person2 = new Person("Fatima", "Lee", 22);
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());
        System.out.println(person2.personInfo());



    }
}
