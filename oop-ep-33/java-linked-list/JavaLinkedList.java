import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("volbo");
        cars.add("marcidise");
        cars.add("rock");

        for (String car : cars) {
            System.out.println(car);
        }
    }
}