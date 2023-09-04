public class JavaObjectMethod {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        JavaObjectMethod rafisCar = new JavaObjectMethod();
        rafisCar.fullThrottle();
        rafisCar.speed(180);

        JavaObjectMethod tahsinCar = new JavaObjectMethod();
        tahsinCar.fullThrottle();
        tahsinCar.speed(120);
    }
}
