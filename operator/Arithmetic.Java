public class Arithmetic {
    public static void main(String[] args) {
        /*
         * Operator: Arithmetic
         * (+) -> Addition
         * (-) -> Subtraction
         * (*) -> Multiplication
         * (/) -> Division
         * (%) -> Modulus
         * (++) -> Increment
         * (--) -> Decrement
         */

         int fNumber = 10;
         int lNumber = 20;

         int addition = fNumber + lNumber; // Output: 30
         System.out.println(addition);
         int subtraction = fNumber - lNumber; // Output: -10
         System.out.println(subtraction);
         int multiplication = fNumber * lNumber; // Output: 200
         System.out.println(multiplication);
        double division =(double) fNumber / lNumber; // Output: 0.5 
         System.out.println(division);
         int modulus = fNumber % lNumber; // Output: 10
         System.out.println(modulus);
    }
}