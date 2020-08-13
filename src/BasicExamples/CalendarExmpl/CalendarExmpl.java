package BasicExamples.CalendarExmpl;

import java.util.Calendar;


public class CalendarExmpl {


    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getClass());
        System.out.println(c.getCalendarType());
        c.set(2020, 7, 13, 11, 54);
        System.out.println("Current date: " + c.getTime());

        long day1 = c.getTimeInMillis();
        //System.out.println(day1);
        day1 += 1000 * 60 * 60;
        // System.out.println("New hour " + c.get(c.HOUR_OF_DAY));

        // add date
        c.add(c.DATE, 35);
        System.out.println("Add 35 days to current date: " + c.getTime());

        // roll date, without changing month
        c.roll(c.DATE, 35);
        System.out.println("Rolling 35 days: " + c.getTime());

        // set time
        c.set(c.DATE, 1);
        System.out.println("Set date: " + c.getTime());


    }

}
