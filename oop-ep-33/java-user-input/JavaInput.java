import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        terminalMessage("start", true);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your username: ");
        // String username = scanner.nextLine();
        System.out.print("Enter your email: ");
        // String email = scanner.nextLine();

        System.out.format("\nHello %s!\n", fullName);

        scanner.close();
        System.out.println("");
    }

    static void terminalMessage(String message, boolean isMess) {
        if (isMess) {
            System.out.format("======Program %s======", message);
        } else {
            System.out.println(message);
        }
    }
}