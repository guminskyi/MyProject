package Encapsulation;

public class DbBuilder {
    public static void main(String[] args) {

        Db db = new Db();

        db.insertData("Zara", 1);
//
//        db.setData("Hurley");
//        db.setYint(8);

        System.out.println(db.getData() + " | " + db.getYint());

    }
}
