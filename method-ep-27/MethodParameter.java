public class MethodParameter {
    // Parameter is: name, age, roll
    static void showDetails(String name, int age, int roll) {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll: " + roll);
    }

    /*
     * store output into another variable
     */
    // Parameter is: name, age, roll
    static String showHistory(String name, int age, int roll) {
        return "Name: " + name + "\nAge: " + age + "\nRoll: " + roll;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied. Your are not old enogh!");
        } else {
            System.out.println("Access granted . Your are old enogh!");
        }
    }

    public static void main(String[] args) {
        // Argument passing
        showDetails("Sabbir Hossain Shuvo", 19, 652841);

        // store output into another variable
        String result = showHistory("Sabbir Hossain Shuvo", 19, 652841);
        System.out.println(result);
        checkAge(18);
    }

}
