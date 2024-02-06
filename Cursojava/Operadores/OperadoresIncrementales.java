package consantiagocom.Cursojava.Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento = Incrementa a en uno, y luego devuelve a
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println();

        //Post incremento = devuelve a y luego incrementa a en uno
        i = 2;
        j = i++; // primero se asigna la variable y despues se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        //Pre decremento = Decrementa a en uno, luego devuelve a
        i = 3;
        j = --i; // i + i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        //Post decremento = Devuelve a, luego decrementa a en uno
        i= 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(++j) = " + (j++));
        System.out.println("j = " + j);
    }
}
