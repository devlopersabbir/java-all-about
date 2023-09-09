class JavaPolymorphism {
    public static void main(String[] args) {
        System.out.println(Helper.multiply(2, 3));
        System.out.println(Helper.multiply(2.3, 3.8));
    }
}

class Helper {
    static int multiply(int a, int b) { // we reveive 2 number a and b which is intiger types
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }
}
