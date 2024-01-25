package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04DatingTime {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2018, 4, 22, 18, 46, 20);
        LocalDateTime end = LocalDateTime.of(2020, 2, 17, 10, 10, 40);

        // Viết chương trình tìm khoảng thời gian 2 người quen nhau
        // yêu cầu kiểm tra lỗi trước khi xử lý
        // năm, tháng, ngày, giờ, phút, giây

        if (start.isAfter(end)) {
            System.out.println("Time Range is not VALID !");
            return;
        }

        LocalDate startDate = start.toLocalDate();
        LocalTime startTime = start.toLocalTime();

        LocalDate endDate = end.toLocalDate();
        LocalTime endTime = end.toLocalTime();

        // P1Y9M26D PT-8H-35M-40S
        Duration duration = Duration.between(startTime, endTime);
        if (duration.isNegative()) {
            duration = duration.plusDays(1);
            endDate = endDate.minusDays(1);
        }
        Period period = Period.between(startDate, endDate);

        System.out.println(period + " " + duration);
    }
}
