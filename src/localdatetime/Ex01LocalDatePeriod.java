package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex01LocalDatePeriod {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.now();

        System.out.println("date: " + date);
        System.out.println("formatted date: " + df.format(date));

        LocalDate anotherDate = LocalDate.of(2025, 8, 18);
        System.out.println("another date: " + df.format(anotherDate));

        LocalDate stringToLDate = LocalDate.parse("22/08/2018", df);
        stringToLDate = stringToLDate.plusDays(2)
                .plus(1, ChronoUnit.DECADES);
        System.out.println("stringToLDate: " + stringToLDate);

        if (date.isBefore(anotherDate)) {
            Period period = Period.between(date, anotherDate);
            System.out.println("period: " + period);
            System.out.println(period.getYears() + " years\n"
                    + period.getMonths() + " months\n"
                    + period.getDays() + " days");
        }

    }
}
