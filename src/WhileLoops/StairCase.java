package WhileLoops;

public class StairCase {
    public static void main(String[] args) {

        String stairs = "";
        int count = 1;

        while (count <= 5) {
            stairs += "*";
            count++;
            System.out.println(stairs);
        }



    }
}
