package Methods;

public class MethodsIntro {
    public static void main(String[] args) {

       sayHello(); // calling sayHello method
       askHowRU();
       reply();
       sayBye();
       sayHelloTo("Nazim");

    }

    public static void sayHello() {

        System.out.println("Hello");
        System.out.println("Hi!");

        System.out.println();

    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    public static void askHowRU() {

        System.out.println("How are you doing?");

    }

    public static void reply() {

        System.out.println("I'm well. How are you doing?");

        System.out.println();

    }

    public static void sayBye() {

        System.out.println("Bye! Have a good day!");

    }

}

// write a method ashHowRU that asks, "How are you doing?"

// write a method reply printing, "I am doing well, hbu?"

// write a method sayBye saying, "Bye! Have a good day!"