package MethodsWithReturn;

public class CProfits {

    public static void main(String[] args) {

        System.out.println(CProfits(10,10));

    }

    public static String CProfits(int buyPrice, int sellPrice) {

        if(buyPrice < sellPrice) {
            return "Profit";
        } else if(buyPrice > sellPrice) {
            return "Loss";
        } else{
            return "No loss";
        }

    }

}
