package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class AppTimeCalculation {

    public static void main(String[] args) {

        printRemainingFridaysMeetingUntilEndOfThisYear();

        printRemainingMothsWeeksDaysUntilEndOfThisYear();

        printDateAfterPeriodOfTime(1, 1,1);

    }

    public static void printRemainingFridaysMeetingUntilEndOfThisYear() {
        LocalDate now = LocalDate.now();
        LocalDate end = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());

        LocalDate firstFriday = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));

        List<LocalDate> fridayMeetings = new ArrayList<>();

        while (firstFriday.isBefore(end) || fridayMeetings.equals(end)) {
            fridayMeetings.add(firstFriday);
            firstFriday = firstFriday.plusWeeks(1);

        }

        System.out.println("Fridays meetings:" + fridayMeetings);
    }


    public static void printRemainingMothsWeeksDaysUntilEndOfThisYear() {
        LocalDate now = LocalDate.now();
        LocalDate endOfYear = now.with(TemporalAdjusters.lastDayOfYear());

        String value = String.format(now.until(endOfYear, ChronoUnit.MONTHS) + " whole months " +
                now.until(endOfYear, ChronoUnit.WEEKS) + " weeks  " +
                now.until(endOfYear, ChronoUnit.DAYS) + " days left until day of " + now.getYear());

        System.out.println(value);

    }

    public static void printDateAfterPeriodOfTime(int year, int month, int day) {
        Period period = Period.of(year, month, day);
        LocalDate newDate = LocalDate.now().plus(period);
        System.out.println(newDate);
    }
    }

