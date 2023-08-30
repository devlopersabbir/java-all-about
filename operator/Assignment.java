package operator;

public class Assignment {
    public static void main(String[] args) {
        /*
         * Assignment
         * (=) -> Assign a value => x = 5
         * (+=) -> x = x + 3
         * (-=) -> x = x - 3
         * (*=) -> x = x * 3
         * (/=) -> x = x / 3
         * (%=) -> x = x % 3
         * ==== Bitwise ====
         * (&=) -> x = x & 3
         * (|=) -> x = x | 3
         * (^=) -> x = x ^ 3
         * (>>=) -> x = x >> 3
         * (<<=) -> x = x >> 3
         */

        // Addition and Assignment
        int addition = 10;
        int lNumber = 20;
        addition += lNumber; // output: 30 (addition = addition + lNumber)
        System.out.println(addition);

        // subtraction and Assignment
        int subtraction = 50;
        subtraction -= 20; // output: 30 (subtraction = subtraction - 20)
        System.out.println(subtraction);

        // Multiplication and Assignment
        byte multiplication = 2;
        multiplication *= 5; // output: 10 (multiplication = multiplication * 5)
        System.out.println(multiplication);

        // Division and Assignment
        int division = 10;
        division /= 5; // Output: 2 (division = division / 5)
        System.out.println(division);

        // Modulus and Assignment
        short modulus = 20;
        modulus %= 6; // Ouptut: 0
        System.out.println(modulus);

        // Bitwise and Assignment
        int andBit = 12;
        andBit &= 11; // Output: 8 (I don't know how they made this output)
        System.out.println(andBit);

        // Bitwise OR Assignment

    }
}