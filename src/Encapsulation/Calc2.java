package Encapsulation;

public class Calc2 {
    private int result;

    public Calc2 plus(int num) {
        result += num;
        return this;
    }

    public Calc2 minus(int num) {
        result -= num;
        return this;
    }

    public int getResult() {
        return result;
    }

}
