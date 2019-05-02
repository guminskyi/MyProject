package WhileLoops;

public class TaskInClass3 {
    public static void main(String[] args) {

        int num = 1;

        while (num < 30) {
            if (num % 2 == 1) {
                System.out.println(num * num);
            }
            num++;
        }
    }
}
