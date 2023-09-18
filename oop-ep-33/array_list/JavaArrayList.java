import java.util.ArrayList; // import java array list

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Sabbir Cars");
        cars.add("Rafi Cars");
        cars.add("Tahsin Cars");
        cars.add("Tanvir Cars");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}