package consantiagocom.Cursojava.ClassDateyCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MMM-yyyy");
        String fechasdf = df.format(fecha);

        long j = 0;
        for (int i = 0; i <10000000 ; i++){
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempofinal = fecha2.getTime()-fecha.getTime();
        System.out.println("Tiempo trascurrido en el for = " + tiempofinal);
        System.out.println("fechasdf = " + fechasdf);
    }
}
