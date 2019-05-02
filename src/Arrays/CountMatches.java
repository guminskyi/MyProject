package Arrays;

public class CountMatches {
    public static void main(String[] args) {

        // create a double array called prices
        // assign 10+ different prices
        // using a loop, count how many items over $20
        // print the count
        // if no item over $20 -> print "NO ITEMS OVER $20"

        double[] prices = new double[]{24.10, 54.11, 4.10, 5.18, 4, 66, 81};
        int count = 0;

        for (double price : prices) {
            if(price > 20) {
                count++;
            }
        }
        System.out.println(count + " items over $20");

        if(count == 0) {
            System.out.println("No items over $20");
        }

    }
}
