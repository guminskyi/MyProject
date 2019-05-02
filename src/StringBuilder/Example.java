package StringBuilder;

public class Example {

    public static void main(String[] args) {

        StringBuilder stb1 = new StringBuilder("Halloween");
        System.out.println(stb1);
        StringBuilder stb2 = new StringBuilder();
        // stb2 + stb2 + "java" // '+' operator doesn't work with STBs
        stb2.append("java");
        System.out.println(stb2);
        stb2.append(", SQL").append(", HTML");
        System.out.println(stb2);

        StringBuilder listBuilder = new StringBuilder("Wooden spoon");
        listBuilder.append(", Iron spoon");
        System.out.println(listBuilder);
        listBuilder.append('I');
        listBuilder.append(1000);
        System.out.println(listBuilder);

        StringBuilder letters = new StringBuilder("ABCDEFGHIJKLM");
        letters.append(", KLM ELEPH");
        System.out.println(letters);

        letters.delete(0,3);
        System.out.println(letters);

        letters.delete(5,10);
        System.out.println(letters);

        // letters.reverse(); => reverses the value
        // letters.deleteCharAt(idx)

        letters.insert(1, "stop");
        System.out.println(letters);

        StringBuilder stbInsert = new StringBuilder("SeleniumAutomation");
        stbInsert.insert(8, " test ");
        System.out.println(stbInsert);

        stbInsert.replace(0, stbInsert.indexOf(" "), "18");
        System.out.println(stbInsert);

    }

}
