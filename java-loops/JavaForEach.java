public class JavaForEach {
    public static void main(String[] args) {
        // cars array
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }

        for (String car : cars) {
            if (car == "BMW") {
                System.out.println("You are lucky! your car is avaiable: " + car);
            }
        }
    }
}
