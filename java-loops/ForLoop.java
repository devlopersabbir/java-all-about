public class ForLoop {
    public static void main(String[] args) {
        /*
         * For Loop
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i);
        }

        // everytime increment will be 2 times
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("Number2: " + i);
        }

        /*
         * nested loop in java
         */
        // Outer loop
        for (int i = 0; i < 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            // inner loop
            for (int j = 0; j < 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
    }
}
