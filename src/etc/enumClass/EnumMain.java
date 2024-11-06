package etc.enumClass;

import java.util.List;

public class EnumMain {
    public static void main(String[] args) {
        Day day = Day.Sunday;

        System.out.println(day.index());

        System.out.println(day.name());

        System.out.println(List.of(Day.values()));

        System.out.println(day.get());
    }
}
