
// abstract class
abstract class Main {
    public String firstName = "Sabbir Hossain";
    public int age = 19;

    public abstract void study(); // this is the abstract method
}

// Subclass (inherit from Main)

class Student extends Main {
    public int graduationYear = 2025;

    public void study() {
        System.out.println("Study all day long!");
    }
}
