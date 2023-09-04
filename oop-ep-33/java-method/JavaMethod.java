
public class JavaMethod {
    // static method
    static String getName() {
        return "Sabbir Hossain";
    }

    // public method
    public int getAge() {
        return 19;
    }

    /**
     * Public -> Can access without creating any object
     * Static -> Can access using the class object
     */

    public static void main(String[] args) {
        JavaMethod gettingAge = new JavaMethod();
        System.out.println(gettingAge.getAge());
        System.out.println(getName());
    }
}
