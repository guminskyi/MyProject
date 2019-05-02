package MethodsWithReturn;

public class GetThunderBlazz {

    public static void main(String[] args) {

        System.out.println(GetThunderBlazz(false, false, 1,2,3));

    }

    public static boolean GetThunderBlazz(boolean available, boolean gift, int ing1, int ing2, int ing3) {

        if(available) {
            return true;
        }
        else if(gift) {
            return true;
        }
        else if(ing1 == 1 && ing2 == 2 && ing3 == 3) {
            return true;
        }
        else if(ing1 == 3 && ing2 == 1 && ing3 == 2) {
            return true;
        }
        else {
            return false;
        }

    }

}
