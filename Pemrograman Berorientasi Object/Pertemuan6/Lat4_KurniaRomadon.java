
package Pertemuan6;

/**
 *
 * @author kurniaromadon
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class Lat4_KurniaRomadon {
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public static void main(String[] args) {
    Date date = new Date();
    System.out.println(sdf.format(date));
    Calendar cal = Calendar.getInstance();
    System.out.println(sdf.format(cal.getTime()));
    LocalDateTime now = LocalDateTime.now();
    System.out.println(dtf.format(now));
    LocalDate localDate = LocalDate.now();
    System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
}
}
