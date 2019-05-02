package MethodsWithReturn;

import java.util.*;

public class ValidateTask {

    public static void main(String[] args) {

        System.out.println(ValidateTask("do the laundry", 2, 1));

    }

    public static boolean ValidateTask(String task, int taskId, int currentId) {

        Scanner scn = new Scanner(System.in);

        task = scn.next();

        if(task.isEmpty() || taskId - currentId != 1) {
            return false;
        } else {
            return true;
        }

    }

}
