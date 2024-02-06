package consantiagocom.Cursojava.Variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        //char caracter = '\u0040'; //mapa de caracteres.
        char decimal = 64; //forma decimal de caracteres
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        System.out.println("");

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        //caracteres especiales

        char espacio = '\u0020';  // para dar espacio
        char retroceso = '\b';    // nos sirve para eliminar un caracter.
        char tabular = '\t';      //para tabular
        char nuevaLinea = '\n';   //nueva linea.
        char retornoCarro = '\r'; //limpia la linea se suele usar primero la \n despues \r

        System.out.println("");

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("char MAX = " + Character.MAX_VALUE);
        System.out.println("char MIN = " + Character.MIN_VALUE);



    }
}
