import java.util.Collections;
import java.util.ArrayList;

public class JavaSortAlpha {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Sabbir");
        names.add("Tanvir");
        names.add("Rafiul");
        names.add("Tahisn");
        names.add("Ankon");
        names.add("Rizvi");

        // sort with Collections
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}