public class Widening {
    public static void main(String[] args) {
        /*
         * Widening Casting
         */
        int myInt = 10;
        System.out.println("Int: " + myInt); // output: 10
        double changeToDouble = myInt; // Automatic casting: int to double
        System.out.println("Double: " + changeToDouble); // output: 10.0
    }
}