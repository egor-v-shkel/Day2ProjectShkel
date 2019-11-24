package by.javatr.shkel.task6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Deadline {
    public static void main(String[] args) {
        String devName;
        int inputDays;
        Calendar gregorianCalendar;

        boolean inputStat = checkInput(args);

        if (inputStat){
            devName = args[0];
            inputDays = Integer.parseInt(args[1]);

            gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(Calendar.DAY_OF_MONTH, inputDays);

            Date deadlineDate = gregorianCalendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
            String strDate = formatter.format(deadlineDate);
            System.out.printf("Developer %s should finish task by %s.\n", devName, strDate);

        }
        else System.out.println("Check input");
    }

    private static boolean checkInput(String[] args) {
        try {
            Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            return false;
        }
        return (args.length == 2);
    }
}
