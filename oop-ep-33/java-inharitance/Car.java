class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut,,, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustag";

    public static void main(String[] args) {

        Car carObj = new Car();
        System.out.println(carObj.brand);

        System.out.println(carObj.modelName);
    }
}