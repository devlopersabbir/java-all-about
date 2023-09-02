public class JavaArrayLoop {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford" };
        // for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // for each loop
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
