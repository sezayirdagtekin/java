package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AppCampaignMessageWithLocalTime {

    public static void main(String[] args) throws InterruptedException {

        campaignMessageTime();
    }

    public static void campaignMessageTime() throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
            LocalDateTime now = LocalDateTime.now();

            LocalDateTime midnight = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);

            System.out.println("midnight:"+midnight);
            String message = String.format("Hurry ,sale ends  at midnight,time left:%s hours, %s minutes,%s seconds,",
                    midnight.getHour() - now.getHour(),
                    midnight.getMinute() - now.getMinute(),
                    midnight.getSecond() - now.getSecond()
            );

            System.out.println(message);

        }
    }
}
