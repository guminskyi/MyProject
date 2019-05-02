package Encapsulation;

public class Carpet {
   double width;
   double length;
   double unitPrice;
   double totalPrice;
   boolean isPersian;

    public Carpet() {
        width = 300;
        length = 300;
        unitPrice = 0;
        totalPrice = 200;
        isPersian = false;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        this.totalPrice = (width + length) * unitPrice;

        if(isPersian) {
            totalPrice += 200;
        }

    }

}
