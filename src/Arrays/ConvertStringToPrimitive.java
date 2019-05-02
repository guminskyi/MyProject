package Arrays;

public class ConvertStringToPrimitive {

    public static <wooden> void main(String[] args) {

        String count = "432";
        int iCount = Integer.parseInt(count);

        String str = "Price is 45.77";
        String[] sp = str.split(" ");
        double price = Double.parseDouble(sp[2]);


        String etsyResult = "wooden spoon (13,950 results)";
        String[] etsy = etsyResult.split(" ");
        etsy[2] = etsy[2].substring(1);
        etsy[2] = etsy[2].replace(",", ".");
        double num = Double.parseDouble(etsy[2]);
        System.out.println(num + "0");



    }

}
