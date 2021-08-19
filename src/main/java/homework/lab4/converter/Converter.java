package homework.lab4.converter;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Converter {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH^mm^ss");

    public static LocalDateTime convertStringToDate(String date){
        return LocalDateTime.parse(date, dateTimeFormatter);
    }

    public static String convertDateToString(LocalDateTime date) {
        return dateTimeFormatter.format(date);
    }

    public static void main(String[] args) throws ParseException {
        String date = "24-03-2015 12^30^00";
        LocalDateTime localDateTime = Converter.convertStringToDate(date);
        System.out.println(localDateTime);
        System.out.println(Converter.convertDateToString(localDateTime));
    }
}
