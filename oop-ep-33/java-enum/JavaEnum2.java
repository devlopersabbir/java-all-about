public class JavaEnum2 {
    public static void main(String[] args) {
        ERole role = ERole.USER;

        switch (role) {
            case ADMIN:
                System.out.println("Admin");
                break;
            case EMPLOYEE:
                System.out.println("Employee");
                break;
            case USER:
                System.out.println("User");
                break;
            case SYSTEM_ADMIN:
                System.out.println("System admin");
                break;
            default:
                System.out.println("Simple person");
                break;
        }
    }
}

enum ERole {
    SYSTEM_ADMIN,
    ADMIN,
    USER,
    EMPLOYEE
}