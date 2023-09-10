class AccessOuterClassFromInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.age);
        System.out.println(inner.getInnerAgeFromInner());
    }
}

class OuterClass {
    int age = 19;

    class InnerClass {
        public int getInnerAgeFromInner() {
            return age;
        }
    }
}