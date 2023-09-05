
public class JavaModifires {
    final String myName = "Sabbir Hossain";

    /**
     * We can't change the my name varibale or override
     *
     * If we really want to do this then we will get this error!
     * will generate an error: cannot assign a value to a final variable
     */

    public static void main(String[] args) {
        JavaModifires getName = new JavaModifires();

        System.out.println(getName.myName);
    }
}
