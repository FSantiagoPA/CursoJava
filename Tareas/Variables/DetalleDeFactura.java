package consantiagocom.Tareas.Variables;

import java.util.Scanner;

public class DetalleDeFactura {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Escribe el nombre de la factura");
            String informacionFactura = scanner.nextLine();

            System.out.println("Ingrese el valor del primer producto");
            double producto1;
            producto1 = scanner.nextDouble();
            System.out.println("Ingrese el valor del segundo producto");
            double producto2;
            producto2 = scanner.nextDouble();

            double totalBruto = producto1 + producto2;
            double impuesto = totalBruto * 0.19;
            double totalNeto = totalBruto + impuesto;

            System.out.println(informacionFactura + " tiene un total bruto de " + totalBruto + "," + " con un impuesto de " + impuesto + " y el monto después de impuesto es de " + totalNeto);
            scanner.close();

        }
}
