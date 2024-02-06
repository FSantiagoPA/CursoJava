package consantiagocom.Cursojava.Variables;

public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 1.5e-10F; //0.00000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en byte a = " + Float.SIZE);
        System.out.println("MAX en float  = " + Float.MAX_VALUE);
        System.out.println("MIN en float  = " + Float.MIN_VALUE);

        System.out.println("");

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en byte a = " + Double.SIZE);
        System.out.println("MAX en double  = " + Double.MAX_VALUE);
        System.out.println("MIN en double  = " + Double.MIN_VALUE);

        System.out.println("");

        float varFlotante = 3.1416F;
        System.out.println("varFlotante = " + varFlotante);

    }
}
