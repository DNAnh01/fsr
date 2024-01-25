package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * JAVA07: DateTime Handling
 * + Date
 * + Calendar
 */
public class Ex01BasicFunctions {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");

        Date date = new Date();
        System.out.println("date: " + date);
        System.out.println(">>>date format: " + df.format(date));
        System.out.println("-----------------");
        // time=1650791264541(epoch/unix time(midnight 1.1.1970), now)
        Calendar c = Calendar.getInstance();

        System.out.println("calendar: " + c);
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH) + 1;
        int year = c.get(Calendar.YEAR);
        String dmy = dayOfMonth + "/" + month + "/" + year;
        System.out.println("DMY: " + dmy);

        String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";

        int hour12 = c.get(Calendar.HOUR);
        // int hour24 = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        String hms = hour12 + ":" + minute + ":" + second + " " + ap;

        System.out.println("HMS: " + hms);

        System.out.println(">>>calendar format: " + df.format(c.getTime()));

    }
}
