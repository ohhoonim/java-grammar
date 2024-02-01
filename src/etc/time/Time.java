package etc.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {
    public static void main(String[] args) {
        // LocalDate : 날짜만 출력
        LocalDate current = LocalDate.now();
        System.out.println(current);
        LocalDate birthday = LocalDate.of(1976, 7, 29);
        System.out.println(birthday);

        // LocalDateTime
        // 시스템 zone 정보가 이미 반영되어있다. 
        System.out.println(LocalDateTime.now());
        // ZonedDateTime
        System.out.println(ZonedDateTime.now(ZoneId.of("+00:00")));
        System.out.println(ZonedDateTime.now(ZoneId.of("-01:00")));
        System.out.println(ZonedDateTime.now(ZoneId.of("+09:00")));

    }
}
