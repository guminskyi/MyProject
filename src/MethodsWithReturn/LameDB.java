package MethodsWithReturn;

import java.util.*;

public class LameDB {

    public static void main(String[] args) {

        System.out.println(lameDB("1test#2bla#3foo#4duh#5meh#6oops","edit","2","bbb"));

    }

    public static String lameDB(String db, String op, String id, String data) {

        // String[] splitted = db.split("#");

        switch(op) {

            case "add":
                return db + "#" + id + data;

            case "edit":

            //if(db.contains(id)) {

                int idNum = Integer.parseInt(id);

                return db.substring(0,db.indexOf(id)) + id + data +
                        db.substring(db.indexOf('#', db.indexOf('#') + idNum));

            // StringUtils.ordinalIndexOf(db, "#", (idNum - 1))

            //}

            case "delete":

                idNum = Integer.parseInt(id);

                return db.substring(0,db.indexOf(id)) +
                        db.substring(db.indexOf('#', db.indexOf('#') + (idNum - 1)));

            default:
                return db;

        }

    }

}
