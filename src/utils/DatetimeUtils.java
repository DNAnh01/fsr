package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import common.WeekDay;

public class DatetimeUtils {
    private DatetimeUtils() {

    }

    public static Date stringToDate(String dateAsString, String pattern) throws ParseException {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.parse(dateAsString);
    }

    public static Calendar stringToCalendar(String dateAsString, String pattern) throws ParseException {
        return dateToCalendar(stringToDate(dateAsString, pattern));
    }

    public static String dateToString(Date date, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }

    public static Calendar dateToCalendar(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c;
    }

    public static String calendarToString(Calendar c, String pattern) {
        return dateToString(calendarToDate(c), pattern);
    }

    public static Date calendarToDate(Calendar c) {
        return c.getTime();
    }

    public static void print(String text, String pattern, Calendar calendar) {
        print(text, pattern, calendar.getTime());
    }

    public static void print(String text, String pattern, Date date) {
        DateFormat df = new SimpleDateFormat(pattern);
        System.out.println(text + ": " + df.format(date));
    }

    public static void print(String text, String pattern, Calendar calendar, TimeZone zone) {
        print(text, pattern, calendar.getTime(), zone);
    }

    public static void print(String text, String pattern, Date date, TimeZone zone) {
        DateFormat df = new SimpleDateFormat(pattern);
        df.setTimeZone(zone);
        System.out.println(text + ": " + df.format(date));
    }

    public static WeekDay getFirstDayOfWeekAsString(Calendar calendar) {
        WeekDay[] weekdays = WeekDay.values();
        int fdow = getFirstDayOfWeekAsInt(calendar);
        return weekdays[fdow - 1];
    }

    public static int getFirstDayOfWeekAsInt(Calendar calendar) {
        return calendar.getFirstDayOfWeek();
    }
}
