public class JavaEnum {
    public static void main(String[] args) {
        ERole role = ERole.SYSTEM_ADMIN;
        System.out.println(role);
    }
}

enum ERole {
    USER,
    ADMIN,
    SYSTEM_ADMIN
}