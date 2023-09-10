class JavaAbs2 {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep();
    }
}

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
