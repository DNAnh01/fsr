package datetime;

import java.util.Calendar;
import java.util.Locale;

import common.WeekDay;

import static utils.DatetimeUtils.*;

public class Ex03FirstDayOfWeek {
    private static String pattern = "dd/MM/yyyy";

    public static void main(String[] args) {
        // Locale: en_US language, country
        Locale.setDefault(Locale.FRANCE);
        System.out.println("default locale: " + Locale.getDefault());

        // US: 1(Sunday)
        // FR: 2(Monday)

        Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
        print("hello", pattern, c);

        int fdow = c.getFirstDayOfWeek();
        System.out.println("First day of week: " + fdow);

        WeekDay fdowAsString = getFirstDayOfWeekAsString(c);
        System.out.println("First day of week as string: " + fdowAsString);
    }
}
