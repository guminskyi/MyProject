package Arrays;

public class LinearIn {

    public static void main(String[] args) {

        int[] outer = {1,2,4,6};
        int[] inner = {2,4};

        System.out.println(linearIn(outer, inner));

    }

        public static boolean linearIn(int[] outer, int[] inner) {
            int numFound = 0;
            if(inner.length == 0) {
                return true;
            }

            int k = 0;
            for(int i = 0; i < outer.length; i++) {
                if(outer[i] == inner[k]) {
                    numFound++;
                    k++;
                } else if(outer[i] > inner[k]) {
                    return false;
                }

                if(numFound == inner.length)
                    return true;
            }

            return false;
        }

}
