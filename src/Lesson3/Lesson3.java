package Lesson3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Lesson3 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println("d Time: " + d.getTime());
        long tenYear = 10 * 365 * 24 * 60 * 60;
        Date d2 = new Date(tenYear * 1000L);
        System.out.println(d2);
        System.out.println("d2 Time: " + d2.getTime());
        System.out.println(d2.after(d));
        System.out.println(d.after(d2));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal);
        System.out.println("Calender Time: " + cal.getTime());
        System.out.println("Calender time in millis: " + cal.getTimeInMillis());
        cal.setTime(d2);
        System.out.println("Month of d2: " + cal.get(Calendar.MONTH));// MONTH start from zero in GregorianCalendar
        System.out.println("Day of the month d2: " + cal.get(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        System.out.println("Month of d2 after change: " + cal.get(Calendar.MONTH));

        //recommand to use
        LocalDate localDate = LocalDate.now(); // Default is yyyy/MM/dd
        System.out.println(localDate);
        LocalDate before10Years = LocalDate.of(2014, 1, 18);
        System.out.println(before10Years);

        String PATTERN = "MM/dd/yyyy";
        String formattedDate = localDate.format(DateTimeFormatter.ofPattern(PATTERN));
        System.out.println("formatted Date : " + formattedDate);


    }


}
