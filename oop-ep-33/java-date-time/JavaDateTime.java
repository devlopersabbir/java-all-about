import java.time.LocalDate; // imported local date

public class JavaDateTime {
    public static void main(String[] args) {
        GetDate date = new GetDate();
        date.todayDate();
    }
}

class GetDate {
    public void todayDate() {
        LocalDate ldate = LocalDate.now();
        System.out.println(ldate);
    }
}