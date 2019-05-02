package MethodsWithReturn;

import java.util.*;

public class ConvertC {

    public static void main(String[] args) {

        String[][] money = { {"euro", "1.5"},
                             {"mark", "21.5"},
                             {"yen", "100.0"} };

        String[][] conversionRate = { {"euro", "0.003"},
                                      {"yen", "0.5"},
                                      {"mark", "0.87"} };

        System.out.println(ConvertC(money, conversionRate));

    }

        public static double ConvertC(String[][] money, String[][] conversionRate) {

            double sum = 0;

            for(int i = 0; i < money.length; i++) {

                for(int j = 0; j < conversionRate.length; j++) {

                    if (money[i][0].equals(conversionRate[j][0])) {
                        sum += Double.parseDouble(money[i][1]) * Double.parseDouble(conversionRate[j][1]);
                    }

                }

            }

            return sum;

        }

    }
