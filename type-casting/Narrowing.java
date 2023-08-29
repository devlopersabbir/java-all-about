public class Narrowing {
    public static void main(String[] args) {
        double myDouble = 12.12d;
        System.out.println("Double: " + myDouble); // output: 12.12

        int changeToInt = (int) myDouble;
        System.out.println(changeToInt); // output: 12
    }
}