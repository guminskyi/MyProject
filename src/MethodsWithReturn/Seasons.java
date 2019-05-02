package MethodsWithReturn;

public class Seasons {

    public static void main(String[] args) {

        int[] arr = {0,-10,3,28,-41,0,3,-5,10,-13,1,15};
        System.out.println(Seasons(arr));

    }

    public static String Seasons(int[] arr) {

        int lwin = 0;
        int lspr = 0;
        int lsum = 0;
        int lfal = 0;
        int hwin = 0;
        int hspr = 0;
        int hsum = 0;
        int hfal = 0;
        int windif;
        int sprdif;
        int sumdif;
        int faldif;
        int wintercount = 0;
        int springcount = 0;
        int summercount = 0;
        int fallcount = 0;

        int[] winter = new int[arr.length / 4];
        int[] spring = new int[arr.length / 4];
        int[] summer = new int[arr.length / 4];
        int[] fall = new int[arr.length / 4];

        for(int a = 0; a < arr.length / 4; a++) {
            winter[wintercount] = arr[a];
            wintercount++;
        }

        for(int b = arr.length / 4; b < arr.length / 2; b++) {
            spring[springcount] = arr[b];
            springcount++;
        }

        for(int c = arr.length / 2; c < (arr.length / 4) * 3; c++) {
            summer[summercount] = arr[c];
            summercount++;
        }

        for(int d = (arr.length / 4) * 3; d < arr.length; d++) {
            fall[fallcount] = arr[d];
            fallcount++;
        }

        for(int e = 0; e < winter.length; e++) {
            if(winter[e] > hwin) {
                hwin = winter[e];
            }
            if(winter[e] < lwin) {
                lwin = winter[e];
            }
        }

        windif = hwin - lwin;

        for(int f = 0; f < spring.length; f++) {
            if(spring[f] > hspr) {
                hspr = spring[f];
            }
            if(spring[f] < lspr) {
                lspr = spring[f];
            }
        }

        sprdif = hspr - lspr;

        for(int g = 0; g < summer.length; g++) {
            if(summer[g] > hsum) {
                hsum = summer[g];
            }
            if(summer[g] < lsum) {
                lsum = summer[g];
            }
        }

        sumdif = hsum - lsum;

        for(int h = 0; h < fall.length; h++) {
            if(fall[h] > hfal) {
                hfal = fall[h];
            }
            if(fall[h] < lfal) {
                lfal = fall[h];
            }
        }

        faldif = hfal - lfal;

        if(windif > sprdif && windif > sumdif && windif > faldif) {
            return "winter";
        } else if(sprdif > windif && sprdif > sumdif && sprdif > faldif) {
            return "spring";
        } else if(sumdif > windif && sumdif > sprdif && sumdif > faldif) {
            return "summer";
        } else if(faldif > windif && faldif > sprdif && faldif > sumdif) {
            return "fall";
        } else {
            return "More than one season with the biggest amplitude";
        }

    }

}
