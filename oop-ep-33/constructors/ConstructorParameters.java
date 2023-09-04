public class ConstructorParameters {
    int x;

    public ConstructorParameters(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ConstructorParameters sendPrams = new ConstructorParameters(20);

        System.out.println(sendPrams.x);
    }
}