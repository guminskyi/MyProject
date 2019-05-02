package Encapsulation;

public class Calc {
    private int x;
    private int y;
    private int result;

    public int getResult() {
        return result;
    }

    public void setY(int myY) {
        y = myY;
    }

    public void setX(int myX) {
        x = myX;
    }

    public void plus() {
        result = (x + y);
    }

    public void minus() {
        result = (x - y);
    }

}
