public class JavaString {
    public static void main(String[] args) {
        String message = "Hello World";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.length()); // output 26

        // check the length from a string varibale
        int messageLength = message.length(); // output: 11
        System.out.println(messageLength);

        // make uppercase
        String lowerCaseToUpper = "md. sabbir hossain shuvo";
        // alternative
        System.out.println(lowerCaseToUpper.toUpperCase());
        System.out.println(lowerCaseToUpper.toUpperCase());

        String findAge = "My age is 20"; // Output: 10
        System.out.println(findAge.indexOf("20"));// it is start counting from 0 since 20 belong into the 10 number
                                                  // index then output is 10

    }
}