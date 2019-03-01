import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Display_times_in_different_country_formats {
    public static void main(String[] args) {

    System.out.println("9.Write a program to display times in different country format.");
    String datePattern = "dd-MMMM-yyyy HH:mm:ss.SSSZ";
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
    String dateOutput = simpleDateFormat.format(date);
        System.out.println("Time according India : " + dateOutput);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Time according UK : " + simpleDateFormat.format(date));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        System.out.println("Time according France : " + simpleDateFormat.format(date));
}
}
