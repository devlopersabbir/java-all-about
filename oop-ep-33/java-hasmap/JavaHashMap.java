import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("name", "Sabbir");
        capitalCities.put("age", "19");
        capitalCities.put("roll", "652841");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("age"));

    }
}
