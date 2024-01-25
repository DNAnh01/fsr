package datetime;

import java.util.Calendar;

import utils.DatetimeUtils;

/**
 * Ex03: Đếm xem tháng hiện tại có bao nhiêu ngày chủ nhật
 */
public class Ex05SundayCounter {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, Calendar.JUNE);

        System.out.println("number of sundays: " + countAmountOfSundays(c));
    }

    private static int countAmountOfSundays(Calendar c) {
        int firstDayOfMonth = 1;
        int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        Calendar startDate = setTime(c, firstDayOfMonth);
        Calendar endDate = setTime(c, lastDayOfMonth);
        endDate.add(Calendar.DAY_OF_MONTH, 1);

        int count = 0;
        System.out.println(startDate.before(endDate));
        while (startDate.before(endDate)) {
            if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                DatetimeUtils.print("==> ", "dd/MM/yyyy", startDate);
                count++;
                startDate.add(Calendar.DAY_OF_MONTH, 7);
            } else {
                startDate.add(Calendar.DAY_OF_MONTH, 1);
            }
        }

        return count;
    }

    private static Calendar setTime(Calendar c, int dayAsNbr) {
        Calendar result = Calendar.getInstance();
        result.setTime(c.getTime());
        result.set(Calendar.DAY_OF_MONTH, dayAsNbr);
        return result;

    }

}
