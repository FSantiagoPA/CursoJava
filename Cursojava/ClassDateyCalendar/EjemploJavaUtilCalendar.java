package consantiagocom.Cursojava.ClassDateyCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //calendar.set(2024,8, 7, 19, 20,10);
        calendar.set(Calendar.YEAR,2020);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        //calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date fecha = calendar.getTime();
        System.out.println("calendar = " + fecha);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = sd.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
