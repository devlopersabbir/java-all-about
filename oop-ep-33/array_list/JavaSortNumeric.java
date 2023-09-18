import java.util.ArrayList;
import java.util.Collections;

public class JavaSortNumeric {
    public static void main(String[] args) {
        ArrayList<Integer> roles = new ArrayList<Integer>();
        Collections.sort(roles);
        for (int role : roles) {
            System.out.println(role);
        }
    }
}