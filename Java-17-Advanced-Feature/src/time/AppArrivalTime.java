package time;


import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;

public class AppArrivalTime {

    public static void main(String[] args) {

        LocalDateTime departure = LocalDateTime.of(2022, Month.SEPTEMBER,22,7,0);

        Flight flight1 = new Flight("Europe/London", "America/New_York", departure, 8);
        Flight flight2 = new Flight("Europe/Berlin", "Asia/Dubai", departure, 4);
        System.out.println(flight1);
        System.out.println(flight2);

    }
}

record Flight(String from, String to, LocalDateTime departure, int duration) {

    @Override
    public String toString() {

        try {

            ZoneId fromZone = ZoneId.of(from);
            ZoneId toZone = ZoneId.of(to);

            ZonedDateTime departureTime = departure.atZone(fromZone);

            ZonedDateTime arrivalTime = departure.plusHours(duration)
                    .atZone(fromZone)
                    .withZoneSameInstant(toZone);

            return String.format("Flight departs at %s and arrives at %s\n", departureTime, arrivalTime);

        } catch (ZoneRulesException e) {
            throw new IllegalArgumentException("Invalid Zone Id:" + e.getMessage());
        }


    }
}