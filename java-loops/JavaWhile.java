public class JavaWhile {
    public static void main(String[] args) {
        int target = 10;
        byte start = 5;
        while (start <= target) { // start is : 5 so 5 hocche choto target: 10 ar theke tahole loop coltei thakbe
                                  // jotokkhon na porjonto 5 barte barte 10 a powchabe.
            System.out.println("Hello: " + start);
            start++;
        }

        /*
         * Purpose
         * print 0 to 5
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}