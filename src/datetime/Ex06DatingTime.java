package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DatetimeUtils;

/**
 * Ex04: Tìm khoảng thời gian 2 người quen nhau với TimeUnit
 * [Years - Months] - Days - Hours - Minutes - Seconds
 * B1: Đổi dateStart về milliseconds(từ dataStart về epoch time)
 * Đổi now tương tự
 * B2: Tìm hiệu của now và dataStart(milliseconds)
 * B3: Đổi từ milliseconds sang days, hours, minutes, second
 * VD: (t)176 cm = 1m 7dm 6cm
 * 
 * : m = 176/100 = 1
 * : remaining = t - m*100 = 76
 * 
 * : dm = = remaining / 10 = 7
 * : remaining = remaining - dm*10 = 6
 * 
 * : cm = remaining
 */
public class Ex06DatingTime {
    public static void main(String[] args) {
        Calendar dateStart = getTime(2022, Calendar.APRIL, 19, 21, 10, 50);
        Calendar now = Calendar.getInstance();

        if (dateStart.after(now)) {
            System.out.println("Date Time Range is not valid !!!");
            return;
        }

        DatetimeUtils.print("start", "dd/MM/yyyy HH:mm:ss", dateStart);
        DatetimeUtils.print("now", "dd/MM/yyyy HH:mm:ss", now);

        long startInMilliseconds = dateStart.getTimeInMillis();
        long nowInMilliseconds = now.getTimeInMillis();

        long duration = nowInMilliseconds - startInMilliseconds; // milliseconds

        long days = TimeUnit.MILLISECONDS.toDays(duration);

        long remainingTime = duration - TimeUnit.DAYS.toMillis(days);
        long hours = TimeUnit.MILLISECONDS.toHours(remainingTime);

        remainingTime -= TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingTime);

        remainingTime -= TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingTime);

        System.out.println(
                "========================"
                        + "\ndays: " + days
                        + "\nhours: " + hours
                        + "\nminutes: " + minutes
                        + "\nseconds: " + seconds);
    }

    private static Calendar getTime(int year, int month, int date, int hour, int minute, int second) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, date, hour, minute, second);
        return c;
    }
}