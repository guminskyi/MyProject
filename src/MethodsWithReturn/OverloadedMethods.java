package MethodsWithReturn;

public class OverloadedMethods {

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2.8, 3.2, 5.6));
        System.out.println(playGame("soccer", 3));
        System.out.println(work("soccer player"));
        System.out.println(work(40, 2400));
    }

    // 2 methods : add
    // 1st - params(2 ints), return int
    // 2nd - params)3 doubles), return double

    public static int add(int one, int two) {
        return one + two;
    }

    public static double add(double one, double two, double three) {
        return one + two + three;
    }

    // method playGame
    // args string, int
    // return boolean

    public static boolean playGame(String game, int players) {
        System.out.println("Playing <" + game + "> with <" + players + "> players");
        return players >= 2;
    }

    // method work
    // arg string jobType
    // return boolean if job = sdet or developer => true; else = false
    // method work
    // args int - hours, double - salary = hours * 60
    // prints: Worked <this many> hours and made <that much> income

    public static boolean work(String jobType) {
        return jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer");
    }

    public static double work(int hours, double salary) {
        salary = hours * 60;
        System.out.println("Worked <" + hours + "> hours and made <" + salary + "> dollars");
        return salary;
    }

}
