package WhileLoops;

public class SnackTime {
    public static void main(String[] args) {

     // create a boolean var 'hungry' = true
     // create int var 'apples' = 1
     // as long as you are hungry, print "eating an apple" and increase the apple
     // once you eat 5 apples, you are no longer hungry

        boolean hungry = true;
        int apples = 1;

        while (hungry && apples <= 5) {
            System.out.println("Eating an apple");
            if (apples == 5) {
                hungry = false;
                System.out.println("No longer hungry");
            }
            apples++;
        }
    }
}
