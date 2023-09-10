// base class
class JavaAbstraction {
    public static void main(String[] args) {
        Sunstar sunObj = new Employee();

        sunObj.printInfo();
    }
}

// java abstract class
abstract class Sunstar {
    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo() {
        String name = "Sabbir Hossain";
        int age = 19;
        float salary = 222.2f;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
