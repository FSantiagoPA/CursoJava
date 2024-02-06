package consantiagocom.Cursojava.FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCaseNombreMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el numero del mes desde 1-12");
        int mes = scanner.nextInt();

        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre = "andres";

        switch (nombre){
            case "admin":
                System.out.println("Hola Admin, bienveido");
                break;
            case "pepe":
                System.out.println("Hola Pepe!");
                break;
            case "andres":
                System.out.println("Hola Andres!");
                break;
            default:
                System.out.println("Usuario desconocido!");

        }
    }
}
