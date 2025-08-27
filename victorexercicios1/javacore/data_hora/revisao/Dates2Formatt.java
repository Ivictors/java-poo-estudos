package victorexercicios1.javacore.data_hora.revisao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates2Formatt {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date1 = simpleDateFormat1.parse("07/05/2018");
        Date dateHours1 = simpleDateFormat2.parse("07/05/2018 15:42:10");

        System.out.println(simpleDateFormat1.format(date1));
        System.out.println(simpleDateFormat2.format(dateHours1));
    }
}
