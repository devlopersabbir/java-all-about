public class TernaryOperator {
    public static void main(String[] args) {
        int time = 20;
        String result = time < 18 ? "Good Day" : "Good Evening"; // without pranthesis
        System.out.println(result);

        int age = 18;
        String isAble = (age >= 18) ? "Ready to able vote" : "Not ready yet";
        System.out.println(isAble);

    }
}
