package stringManipPractice;

public class MikeSmith {
    public static void main(String[] args) {

       String SMSmessage = "Sender<Mike Smith>. From Number: [202-123-3456]. " +
               "Message: {I love programing and problem solving}";

       System.out.println(SMSmessage.indexOf("<") + 1);
       System.out.println(SMSmessage.indexOf(">"));
       System.out.println(SMSmessage.indexOf("[") + 1);
       System.out.println(SMSmessage.indexOf("]"));
       System.out.println(SMSmessage.indexOf("{") + 1);
       System.out.println(SMSmessage.indexOf("}"));

       String sender = SMSmessage.substring(7,17);
       String phoneNumber = SMSmessage.substring(34,46);
       String message = SMSmessage.substring(59,96);

       System.out.println(sender);
       System.out.println(phoneNumber);
       System.out.println(message);

    }
}
