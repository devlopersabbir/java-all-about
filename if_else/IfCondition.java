
public class IfCondition {
    /*
     * Java Condition and if statement
     */
    public static void main(String[] args) {
        // if statement
        // Static value
        if (20 < 30) {
            System.out.println("true :(");
        }
        /*
         * if else with dynamic
         */
        int a = 2;
        int b = 30;
        if (a < b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /*
         * If Else
         * -> else....if statement
         */
        if (a <= 2) {
            System.out.println("A ar theke 2 boro ba soman");
        } else if (b <= 2) {
            System.out.println("b ar theke 2 boro ba soman");
        } else if (a <= b) {
            System.out.println("a ar theke b boro ba soman");
        } else {
            System.out.println("kono tai sothik noy");
        }
    }
}
