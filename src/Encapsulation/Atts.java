package Encapsulation;

public class Atts {

    String name;
    String color;
    int amount;

    private String name2;
    private String color2;
    private int amount2;

    public String getCar2() {
        return name2;
    }

    public void setCar2(String newName) {
        name2 = newName;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String newColor) {
        color2 = newColor;
    }

    public int getAmount2() {
        return amount2;
    }

    public void setAmount2(int newAmount) {
        amount2 = newAmount;
    }

}
