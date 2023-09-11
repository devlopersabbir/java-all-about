public class JavaEnum3 {
    public static void main(String[] args) {
        for (ESemester semester : ESemester.values()) {
            System.out.println("Semesters: " + semester);
        }
    }
}

enum ESemester {
    FIRST_SEMESTER,
    SECOND_SEMESTER,
    THIRD_SEMESTER,
    FOURTH_SEMESTER,
    FIVTH_SEMESTER,
    SIX_SEMESTER,
    SEVEN_SEMESTER,
    EIGHT_SEMESTER
}