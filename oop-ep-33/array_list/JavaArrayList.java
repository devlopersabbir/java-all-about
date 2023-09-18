import java.util.ArrayList; // import java array list

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Sabbir Cars");
        cars.add("Rafi Cars");
        cars.add("Tahsin Cars");
        cars.add("Tanvir Cars");

        System.out.println(cars.size());

        System.out.println(cars);
        cars.set(1, "Rizvi Cars");

        for (String car : cars) {
            System.out.println(car);
        }

        cars.remove(3);
        System.out.println(cars);
        // cars.clear();
        System.out.println(cars + "=====loop=====");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }
}