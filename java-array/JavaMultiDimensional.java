
public class JavaMultiDimensional {
    public static void main(String[] args) {
        /*
         * Multi Dimensinal Array
         */
        String[][] friendHistory = {
                { "Rafi", "20", "4th", "652812" },
                { "Sabbir", "19", "4th", "652841" },
                { "Tanvir", "18", "4th", "652838" }
        };
        for (int i = 0; i < friendHistory.length; i++) {
            for (int j = 0; j < friendHistory[i].length; j++) {
                System.out.println(friendHistory[i][j]);
            }
        }
    }
}
