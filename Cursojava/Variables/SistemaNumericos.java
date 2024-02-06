package consantiagocom.Cursojava.Variables;

import javax.swing.*;

public class SistemaNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("NumeroBinario = " + numeroBinario);

        String resultadoOctal = "Numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexa = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);
        int numeroHexa = 0x1f4;
        System.out.println("numeroHexa = " + numeroHexa);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa ;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
