public class JavaClassObject {
    // atribute
    int x = 20;

    public static void main(String[] args) {
        // object
        JavaClassObject myobj = new JavaClassObject();
        System.out.println(myobj.x);

        JavaClassObject object2 = new JavaClassObject();
        object2.x = 22;
        System.out.println(object2.x);
    }
}
