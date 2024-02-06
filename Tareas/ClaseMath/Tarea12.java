package consantiagocom.Tareas.ClaseMath;

import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el radio de un circulo");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio,2);

        System.out.println("El area del circulo es: " + area);
    }
}
