package Encapsulation;

public class Db {
    private String data;
    private int yint;

    public void insertData(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public void setData(String newData) {
        data = newData;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int newYint) {
        yint = newYint;
    }

}
