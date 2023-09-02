public class JavaArray {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford" };
        for (int i = 0; i < cars.length; i++) {

            if (cars[i] == "Ford") {
                cars[i] = "Changed Car";
            }
            System.out.println(cars[i]);
        }

    }
}
