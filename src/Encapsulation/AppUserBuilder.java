package Encapsulation;

public class AppUserBuilder {
    public static void main(String[] args) {

        AppUser user1 = new AppUser("ironman", "Mark Smith", "ac124");
        AppUser user2 = new AppUser("postman", "Sam Sung", "ac12asfasf4");
        AppUser user3 = new AppUser("superman", "Young Thug", "acasfasr12124");

        user1.setCount(104);

        System.out.println(user1.getCount());
        System.out.println(user2.getCount());
        System.out.println(user3.getCount());

        AppUser user4 = new AppUser();
        System.out.println(user4.getCount());

        System.out.println(user1.getUserId());

    }
}
