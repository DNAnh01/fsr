package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import common.WeekDay;

public class Ex02WeekMonthYear {
    public static void main(String[] args) {
        WeekDay[] weekdays = WeekDay.values();

        Calendar c = Calendar.getInstance();
        // Sunday(1), Monday(2) .... Saturday(7) ..

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("day of week: " + dayOfWeek);
        System.out.println("dayOfWeek: " + weekdays[dayOfWeek - 1]);

        c.set(Calendar.DAY_OF_MONTH, 27);
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("dayOfWeek: " + weekdays[dayOfWeek - 1]);

        System.out.println("=======================");
        // Xem thử còn mấy ngày nữa là đến tết
        c.set(Calendar.YEAR, 2024);
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        int year = c.get(Calendar.YEAR);
        int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println("Is " + year + " Leap Year: " + new GregorianCalendar().isLeapYear(year));
        System.out.println("Year " + year + " has " + daysInYear + " days");
        System.out.println("Today is " + dayOfYear + " th day");
        System.out.println("Remaning days: " + (daysInYear - dayOfYear));

        // Xem thử tháng hiện tại có mấy ngày
        int month = c.get(Calendar.MONTH);
        int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Month " + month + " has " + daysInMonth + " days");
        // Xem thử còn mấy ngày nữa là đến sinh nhật
    }
}
