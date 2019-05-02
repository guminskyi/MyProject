package StringBuilder;

public class AppendAlphabet {
    public static void main(String[] args) {

        char ch = 'A';
        ch++;
        // System.out.println(ch);

        StringBuilder alphabet = new StringBuilder();
        String str = "";

        for(char chars = 'A'; chars <= 'z'; chars++) {
            alphabet.append(chars);
            str += chars;
            System.out.println(alphabet);
        }

    }
}
