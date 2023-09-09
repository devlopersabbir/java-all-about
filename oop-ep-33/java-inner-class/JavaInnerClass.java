public class JavaInnerClass {
    public static void main(String[] args) {
        OutterClass outTer = new OutterClass();
        System.out.println(outTer.x);
        // way to call inner class
        OutterClass.InnerClass innerCls = outTer.new InnerClass();
        System.out.println(innerCls.y + outTer.x);
    }
}

class OutterClass {
    int x = 10;

    class InnerClass {
        int y = 40;
    }
}