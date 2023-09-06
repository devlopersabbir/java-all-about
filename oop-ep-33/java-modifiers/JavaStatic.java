/**
 * Different between public and static
 */

public class JavaStatic {
    // Static method
    static void getStaticMethod() {
        System.out.println("Static method!");
    }

    // public method
    public void getPublicMethod() {
        System.out.println("Public method");
    }

    // main method
    public static void main(String[] args) {
        JavaStatic getMethod = new JavaStatic();

        getStaticMethod(); // static method calling
        // getMethod.getStaticMethod(); // static method || it's not good way
        getMethod.getPublicMethod(); // public method
    }
}
