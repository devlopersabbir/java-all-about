import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");

        String username = scanner.nextLine();
        if (username.length() > 1) {
            System.out.println(username);
        } else {
            System.out.println("Input filed was empty!");
        }

        scanner.close();
    }
}