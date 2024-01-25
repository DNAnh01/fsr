package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTimeDuration {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime start = LocalTime.now();
        LocalTime end = LocalTime.of(23, 18, 20);

        System.out.println("start: " + df.format(start));
        System.out.println("end: " + df.format(end));

        Duration duration = Duration.between(start, end);
        System.out.println("duration: " + duration);
        System.out.println(duration.toHours() + " hours\n"
                + duration.toMinutesPart() + " minutes\n"
                + duration.toSecondsPart() + " seconds");
    }
}
