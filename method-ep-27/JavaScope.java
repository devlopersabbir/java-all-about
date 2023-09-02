public class JavaScope {
    public static void main(String[] args) {
        {
            // this called block scope
            int x = 20;
            System.out.println(x);
        }
    }
}
