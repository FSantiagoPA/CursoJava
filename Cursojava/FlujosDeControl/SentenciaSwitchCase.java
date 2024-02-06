package consantiagocom.Cursojava.FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 5;

        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
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
