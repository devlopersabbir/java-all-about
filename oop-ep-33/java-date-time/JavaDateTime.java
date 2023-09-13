import java.time.LocalDate; // imported local date
import java.time.LocalTime; // imported local time
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; // imported local date time

public class JavaDateTime {
    public static void main(String[] args) {
        GetDate date = new GetDate();
        date.todayDate();
        date.currentTime();
        date.getDateTime();
        date.formatDateTime();
    }
}

class GetDate {
    public void todayDate() {
        LocalDate ldate = LocalDate.now();
        System.out.println(ldate);
    }

    public void currentTime() {
        LocalTime ltime = LocalTime.now();
        System.out.println(ltime);
    }

    public void getDateTime() {
        LocalDateTime ldateTime = LocalDateTime.now();
        System.out.println(ldateTime);
    }

    public void formatDateTime() {
        LocalDateTime localdt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

        String fDateTime = formatter.format(localdt);
        System.out.println(fDateTime);
    }
}