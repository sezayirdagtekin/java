package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

public class AppDateFormatter {

    public static void main(String[] args) {
        printLocalizedDateWithStyle();
        printLocalizedDateWithStyleAndLocale();
        printSingleFormat();
        printWithMultipleFormatter();
    }


    public static void printLocalizedDateWithStyle() {
        var now = LocalDateTime.now();

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(now));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(now));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(now));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(now));
    }

    public static void printLocalizedDateWithStyleAndLocale() {

        var now = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US).format(now));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US).format(now));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.US).format(now));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.US).format(now));

    }


    public static void printSingleFormat() {
        var now = LocalDateTime.now();
        String pattern = "MM.dd.YYY";
        System.out.println(DateTimeFormatter.ofPattern(pattern).format(now));
    }

    public static void printWithMultipleFormatter() {


        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        builder.appendOptional(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        DateTimeFormatter formatter = builder.toFormatter();
        System.out.println(LocalDate.parse("2022-07-18", formatter));
        System.out.println(LocalDate.parse("18-07-2022", formatter));
    }


}
