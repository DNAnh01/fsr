package datetime;

import java.util.Calendar;
import java.util.TimeZone;

import utils.DatetimeUtils;

/**
 * Locale(language, country) ==> First Day Of Week
 * TimeZone: ZoneInfo ==> print time
 */

public class Ex07TimeZone {

    public static void main(String[] args) {
        System.out.println("Default Timezone: " + TimeZone.getDefault());

        // Europe/Berlin
        // Europe/Monaco

        Calendar c = Calendar.getInstance();
        DatetimeUtils.print("now", "dd/MM/yyyy HH:mm:ss", c);

        TimeZone tzBrlin = TimeZone.getTimeZone("Europe/Monaco");
        Calendar berlin = Calendar.getInstance(tzBrlin);
        DatetimeUtils.print("now", "dd/MM/yyyy HH:mm:ss", berlin, tzBrlin);
    }
}