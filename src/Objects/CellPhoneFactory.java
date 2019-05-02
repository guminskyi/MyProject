package Objects;

public class CellPhoneFactory {
    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();
        phone1.brand = "Apple iPhone X";
        phone1.color = "black";
        phone1.price = 650.00;

        phone1.call();
        phone1.text();

        System.out.println(phone1.brand);

        CellPhone phone2 = new CellPhone();
        CellPhone phone3 = new CellPhone();

        phone2.brand = "Ericsson 1018";
        phone2.color = "Silver";
        phone2.price = 30.50;

        phone3.brand = "HTC Evo";
        phone3.color = "Rose";
        phone3.price = 350.99;

        phone2.call();
        phone3.text();

        System.out.println("phone1 brand - " + phone1.brand);

        double total = phone1.price + phone2.price + phone3.price;
        System.out.println("Total price: " + total);

        // can we update obj values? yes
        phone1.price = 1200.0;
        phone2.price = phone3.price;



    }

}
