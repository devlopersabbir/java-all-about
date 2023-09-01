import java.util.Random;

public class Maths {
    public static void main(String[] args) {
        /*
         * Math.max()
         * Argument: x,y
         * This method will help us to get max number between a and b
         */
        System.out.println(Math.max(20, 40)); // 40
        /*
         * Math.min()
         * Argument: x,y -> int
         * This method will help us to get min number between a and b
         */
        System.out.println(Math.min(20, 40)); // 20
        /*
         * Math.sqrt()
         * Argument: x -> int
         * This method will help us to sqrt any number
         */
        System.out.println((int) Math.sqrt(64)); // 8
        /*
         * Math.abs()
         * Argument: x -> int
         * This method will help us to get absolute positive value
         */
        System.out.println(Math.abs(-64.69)); // 64.69

        /*
         * Math.random()
         * Argument: not required
         * This method will help us to generate random number
         */
        System.out.println((int) Math.random() * 20); // (Random)
        // or
        System.out.println(new Random().nextInt(10) + 1); // generate random number including 1 to 10
    }
}