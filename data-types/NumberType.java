
public class NumberType {
    public static void main(String[] args) {
        byte a = 111; // bye not able to store more then 3 number
        System.out.println("Byte: " + a);

        short b = 5555; // short not able to store more then 4 number
        System.out.println("Short: " + b);

        int c = 666666666; // int not able to store more then 9 numbers
        System.out.println("Int: " + c);

        long d = 1500000000000000000l; // Long not able to store more then 19 numbers.
        /*
         * NOTE:
         * In the long data type when we assign value then we have add L/l to mentioned
         * it is a long data type
         */
        System.out.println("Long: " + d);

        /*
         * Floating Type
         * Capacity: 6/7 decimal digit
         * Scientific: for example value is: 35,
         * So we can make it: 35 and in last add extra 3 zero like 35e3 and lastly f
         * indicate float
         */
        float sscPoint = 4.79f; // End of the valu f is required for floating point number
        System.out.println("SSC Point: " + sscPoint);
        float f1 = 4e5f; // this is scientific value
        System.out.println("f1: " + f1);

        /*
         * Double Type
         * Capacity: 15 digit
         */
        double balance = 3242.532432d;
        System.out.println("Current balance: " + balance);
    }
}