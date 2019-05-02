package MethodsWithReturn;

import java.util.ArrayList;

public class Nanuk {

    public static void main(String[] args) {

        ArrayList<String> r = new ArrayList<>();
        r.add("1");
        r.add("3");
        r.add("nanuk");
        r.add("nanuk");
        r.add("nanuk");
        r.add("3");

        int waystones = 3;
        int boast = 7;

        System.out.println(Nanuk(r, waystones, boast));

    }

    public static boolean Nanuk(ArrayList<String> r, int waystones, int boast) {

        int fish = 0;
        boolean victory = false;

        for(int i = 0; i < r.size(); i++) {

            if(!r.get(i).equals("nanuk")) {
                fish += Integer.parseInt(r.get(i));
            } else {
                if(waystones > 0) {
                    waystones--;
                    continue;
                } else {
                    break;
                }
            }

        }

        if(fish >= boast) {
            victory = true;
            return victory;
        } else {
            return victory;
        }

    }

}
