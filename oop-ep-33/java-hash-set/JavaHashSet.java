import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("Sabbir");
        names.add("Sobuj");
        names.add("Roton");
        names.add("Sabbir");

        System.out.println(names);
    }
}