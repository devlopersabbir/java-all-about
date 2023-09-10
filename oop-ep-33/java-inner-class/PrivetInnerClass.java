class PrivetInnerClass {
    public static void main(String[] args) {
        OutterClass outer = new OutterClass();

        System.out.println(outer.nam);

        // OutterClass.InnerPrivetClass innerCls = outer.new InnerPrivetClass(); // this
        // throw error because this a
        // protected class
    }
}

class OutterClass {
    String nam = "Sabbir";

    // private class InnerPrivetClass {
    // int age = 19;
    // }
}