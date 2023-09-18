import java.util.ArrayList;
import java.util.Collections;

public class JavaSortNumeric {
    public static void main(String[] args) {
        ArrayList<Integer> roles = new ArrayList<Integer>();
        roles.add(652841);
        roles.add(652810);
        roles.add(652838);
        roles.add(652817);

        Collections.sort(roles);
        for (int role : roles) {
            System.out.println(role);
        }
    }
}