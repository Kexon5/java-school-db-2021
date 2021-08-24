package homework.lab5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {
        Stream.iterate(LocalDate.of(startYear, 1, 1),
                date -> date.getYear() <= endYear, date -> date.plusDays(1))
                .filter(date->date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .filter(date->date.getDayOfMonth() == 13)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((y1, y2) -> (int) (y2.getValue() - y1.getValue()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        BlackFridayService.printBlackFridayPerYearSorted(1985, 2020);
    }
}
