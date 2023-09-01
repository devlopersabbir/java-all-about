public class Booleans {
    public static void main(String[] args) {
        boolean isJavaSimple = true; // true | false
        System.out.println(isJavaSimple); // true

        /*
         * Boolean Expression
         */
        int a = 10;
        int b = 20;
        System.out.println(a < b); // Since b is higher then b then it's return true
        System.out.println(a == b); // it's return false. because of a is not equal b
        System.out.println(a >= b); // false
        System.out.println(a >= 10); // true

        /*
         * Simple voting app using java
         */
        int sabbirAge = 19;
        int rafiAge = 17;
        int tanvirAge = 18;

        int votingAge = 18;
        if (sabbirAge >= votingAge) {
            System.out.println("Sabbir can vote. Your age: " + sabbirAge);
        } else {
            System.out.println("Sabbir can't vote. Age is: " + sabbirAge);
        }

        if (rafiAge >= votingAge) {
            System.out.println("Rafi can vote. Age is: " + rafiAge);
        } else {
            System.out.println("Rafi can't vote. Age is: " + rafiAge);
        }

        if (tanvirAge >= votingAge) {
            System.out.println("Tanvir can vote. Age is: " + tanvirAge);
        } else {
            System.out.println("Tanvir can't vote. Age is: " + tanvirAge);
        }
    }
}
