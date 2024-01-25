package datetime;

import java.util.Calendar;

import static utils.DatetimeUtils.*;

public class Ex04PrintAllCurrentWeekDays {
    // current date: 27.04
    // output: 24.04(Sunday) - 30.04(Saturday): US
    // : 25.04(Monday) - 01.05(Sunday): VN || FR
    public static void main(String[] args) {
        // 24.04.2022
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 16);

        Calendar fdow = Calendar.getInstance();
        fdow.setTime(c.getTime());

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        int fdowAswd = c.getFirstDayOfWeek();

        fdow.add(Calendar.DAY_OF_MONTH, fdowAswd - dayOfWeek);
        print("fdocw", "dd/MM/yyyy E", fdow);

        // int firstDayOfWeek = dayOfMonth + fdowAswd - dayOfWeek;
        // System.out.println("first day of current week: " + firstDayOfWeek);

        // 24.04.2022
        for (int i = 1; i <= 6; i++) {
            fdow.add(Calendar.DAY_OF_MONTH, 1);
            print("fdocw", "dd/MM/yyyy E", fdow);
        }

    }
}
