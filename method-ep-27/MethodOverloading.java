
public class MethodOverloading {
    // double
    static double additionDouble(int x) {
        return x + 2;
    }

    // int
    static int additionInt(int x) {
        return x + 2;
    }

    /*
     * Like this sisuasion
     * We can use methodoverloading
     */
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(additionDouble(20));
        System.out.println(additionInt(10));

        // method overloading
        System.out.println(plusMethod(20.03, 10.32)); // when u set double then it will auto call double AND when you
                                                      // pass int then it call int
    }
}
