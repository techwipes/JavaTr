package BasicExamples.CalendarExmpl;

import static java.lang.System.out;

import java.util.*;


public class FullMoons {

    static int DAY_IM = 1000 * 60 * 60 * 24;


    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        day1 += (DAY_IM * 29.52);
        for (int x = 0; x < 60; x++) {
            c.setTimeInMillis(day1);
            out.println(String.format("Fool moon on %tc", c));
            day1 += (DAY_IM * 29.52);
        }

    }
}
