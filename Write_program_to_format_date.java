import java.text.SimpleDateFormat;
import java.util.Date;

public class Write_program_to_format_date {
    public static void main(String[] args) {


        String datePattern = "dd-MMMM-yyyy";
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        String dateOutput = simpleDateFormat.format(date);
        System.out.println("Todays's date : " + dateOutput);
    }
}
