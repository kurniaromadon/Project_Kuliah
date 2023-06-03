
package Pertemuan6;

/**
 *
 * @author kurniaromadon
 */

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
public class Lat1_KurniaRomadon {
    public static void main(String[] args) throws Exception {
    // displaying current date and time
    Calendar cal = Calendar.getInstance();
SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
    System.out.println("Today's date and time = "+simpleformat.format(cal.getTime()));
    // displaying date
    Format f = new SimpleDateFormat("MM/dd/yy");
    String strDate = f.format(new Date());
    System.out.println("Current Date = "+strDate);
    // current time
    f = new SimpleDateFormat("HH.mm.ss Z");
    String strTime = f.format(new Date());
    System.out.println("Current Time = "+strTime);
    // displaying hour
    f = new SimpleDateFormat("H");
    String strHour = f.format(new Date());
    System.out.println("Current Hour = "+strHour);
    // displaying minutes
    f = new SimpleDateFormat("mm");
    String strMinute = f.format(new Date());
    System.out.println("Current Minutes = "+strMinute);
    // displaying seconds
    f = new SimpleDateFormat("ss");
    String strSeconds = f.format(new Date());
    System.out.println("Current Seconds = "+strSeconds);
}
}
