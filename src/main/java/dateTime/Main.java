package dateTime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();
    }
    public static void task1(){
        int year = 2015;
        int month = 11;
        int day = 31;
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.clear();

        calendar.set(Calendar.YEAR , year);
        calendar.set(Calendar.MONTH , month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        System.out.println(calendar.getTime());

    }
    public static void task2(){

        Calendar calendar = Calendar.getInstance();
        System.out.println("Year " +  calendar.get(Calendar.YEAR));
        System.out.println("Month " + calendar.get(Calendar.MONTH ));
        System.out.println("Day " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute " + calendar.get(Calendar.MINUTE));

    }

    public static void task3(){

        Calendar calendar = Calendar.getInstance();
        int maxYearCalendar = calendar.getActualMaximum(Calendar.YEAR);
        int maxMonthCalendar = calendar.getActualMaximum(Calendar.MONTH);
        int maxDayCalendar = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int maxWeekOfYearCalendar = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);

        System.out.println("Actual Maximum Year: "+maxYearCalendar);
        System.out.println("Actual Maximum Month: "+maxMonthCalendar);
        System.out.println("Actual Maximum Week of Year: "+maxWeekOfYearCalendar);
        System.out.println("Actual Maximum Date: "+maxDayCalendar+"\n");
    }

    public static void task4(){
        Calendar calendar = Calendar.getInstance();
        int maxYearCalendar = calendar.getActualMinimum(Calendar.YEAR);
        int maxMonthCalendar = calendar.getActualMinimum(Calendar.MONTH);
        int maxDayCalendar = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        int maxWeekOfYearCalendar = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);

        System.out.println("Actual Minimum Year: "+maxYearCalendar);
        System.out.println("Actual Minimum Month: "+maxMonthCalendar);
        System.out.println("Actual Minimum Week of Year: "+maxWeekOfYearCalendar);
        System.out.println("Actual Minimum Date: "+maxDayCalendar+"\n");
    }

    public static void task5(){
        Calendar calendarNY = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));

        System.out.println("Time in New York: " + calendarNY.get(Calendar.HOUR_OF_DAY) + ":"
                + calendarNY.get(Calendar.MINUTE)+":"+calendarNY.get(Calendar.SECOND));

    }

    public static void task6(){
        Calendar calendarNY = Calendar.getInstance();
        System.out.println("Time in local zone: " + calendarNY.get(Calendar.HOUR_OF_DAY) + ":"
                + calendarNY.get(Calendar.MINUTE)+":"+calendarNY.get(Calendar.SECOND));
    }
}
