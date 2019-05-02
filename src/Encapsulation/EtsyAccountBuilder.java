package Encapsulation;

public class EtsyAccountBuilder {
    public static void main(String[] args) {

        EtsyAccount acc1 = new EtsyAccount();
        acc1.setEmail("mike.smith@gmail.com");
        acc1.setFirstName("Mike");
        acc1.setPassword("smither");

        System.out.println(acc1.getEmail() + " | " + acc1.getFirstName() + " | " + acc1.getPassword());

        EtsyAccount myAcc = new EtsyAccount();
        myAcc.setAccountInfo("myemail@yahoo.com", "Bill", "abc123");
        myAcc.setEmail(myAcc.getEmail().replace("yahoo", "gmail"));

        System.out.println(myAcc.getEmail() + " | " + myAcc.getFirstName() + " | " + myAcc.getPassword());

        EtsyAccount yourAcc = new EtsyAccount();
        yourAcc.setAccountInfo("yourEmail123@gmail.com", "Apple", "macbook34");
        String accountInfo = yourAcc.getAccountInfo();

        System.out.println(accountInfo);

    }
}
