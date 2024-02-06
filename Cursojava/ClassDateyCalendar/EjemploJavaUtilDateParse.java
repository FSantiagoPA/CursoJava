package consantiagocom.Cursojava.ClassDateyCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa una fecha con l siguiente formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(scanner.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)){
                System.out.println("Fecha1 (del usuario es depues que fecha2) (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha es antes que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha1 es igual que fecha2");
            }
            
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha1 (del usuario es depues que fecha2) (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es antes que fecha2");
            } else if (fecha.compareTo(fecha2) == 0){
                System.out.println("fecha1 es igual que fecha2");
            }

        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("La fecha tiene un informato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            System.exit(1);
            //main(args);
        }

    }
}
