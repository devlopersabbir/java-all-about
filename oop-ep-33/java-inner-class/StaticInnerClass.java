public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClss.StaticInnrClass inerr = new OuterClss.StaticInnrClass(); // calling static method
        System.out.println(inerr.age);
    }
}

class OuterClss {
    String nam = "Sabbir Hossain Shuvo";

    static class StaticInnrClass {
        int age = 19;
    }
}