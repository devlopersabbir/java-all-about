public class JavaInterface {
    public static void main(String[] args) {
        Ping obj = new Ping();
        obj.animalSound();
        obj.run();
    }
}

class Ping implements Animal {
    public void animalSound() {
        System.out.println("pok pok");
    }

    public void run() {
        System.out.println("go....");
    }

    public void again() {
        System.out.println("again");
    }
}

// interface
interface Animal {
    public void animalSound(); // // interface method (does not have a body)

    public void run();
}