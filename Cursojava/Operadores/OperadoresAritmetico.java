package consantiagocom.Cursojava.Operadores;

import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suman = i + j;

        System.out.println("suman = " + suman);

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j)); //Siempre le debemos poner los parantesis para que no nos de error

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j;
        float div2 = (float) i / j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (num % 2 == 0){
            System.out.println("Numero par = " + num);
        }else{
            System.out.println("Numero impar = " + num);
        }





    }
}
