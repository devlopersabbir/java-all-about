public class Cng extends Car {
    public static void main(String[] args) {
        Cng cngObject = new Cng();
        System.out.println(cngObject.brand);
        System.out.println(cngObject.getDetails());
    }
}

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut,,, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustag";

    String getDetails() {
        return "Brand name is: " + this.brand + "; Car model: " + this.modelName;
    }
}
