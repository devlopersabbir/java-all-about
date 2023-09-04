// create a Main class called JavaConstructor
public class JavaConstructors {
    int x; // Create a class attribute

    // Create a class constructor for the JavaConstructor class
    public JavaConstructors() {
        x = 5; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        JavaConstructors constCheck = new JavaConstructors();

        System.out.println(constCheck.x);
    }
}