package by.javatr.shkel.task7;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Birthday {
    public static void main(String[] args) {
        int inDay, inMonth, inYear;

        inDay = Integer.parseInt(args[0]);
        inMonth = Integer.parseInt(args[1]);
        inYear = Integer.parseInt(args[2]);

        Calendar birthday = new GregorianCalendar(inYear, inMonth - 1, inDay);
        Calendar currentDate = new GregorianCalendar();

        int fullYear = calcDiff(birthday, currentDate);
        String dayOfWeek = birthday
                .getDisplayName(DAY_OF_WEEK, LONG, Locale.getDefault())
                .toLowerCase();

        System.out.println("Day of week - "+ dayOfWeek);
        System.out.println("Full year "+ fullYear);

        if(currentDate.get(DAY_OF_YEAR) == birthday.get(DAY_OF_YEAR))
            System.out.println("Happy Birthday!");
    }

    private static int calcDiff(Calendar birthday, Calendar currentDate) {
        int diff = currentDate.get(YEAR) - birthday.get(YEAR);
        if (birthday.get(MONTH) > currentDate.get(MONTH) ||
                (birthday.get(MONTH) == currentDate.get(MONTH) && birthday.get(DATE) > currentDate.get(DATE))) {
            diff--;
        }

        return diff;
    }
}
