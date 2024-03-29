package consantiagocom.Cursojava.Variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a" + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a" + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        System.out.println("");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a" + Short.BYTES);
        System.out.println("tipo short corresponde en bites a" + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        System.out.println("");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a" + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a" + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        System.out.println("");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a" + Long.BYTES);
        System.out.println("tipo long corresponde en bites a" + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

        System.out.println("");

        var numeroVar = 127;

    }
}
