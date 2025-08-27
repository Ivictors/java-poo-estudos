package victorexercicios1.javacore.data_hora;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        System.out.println(c);
        System.out.println(c.getCalendarType());
        System.out.println(Calendar.MAY);
    }
}
