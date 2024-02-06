package consantiagocom.Cursojava.ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        // toma el valor absoluto de un numero da igualsi es positivo o negativo
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        // toma el valor maximo de un numero
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        // toma el valor minimo
        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        // redondea hacia arriba ej: 3.5 pasaria a 4.0
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // redondea hacia abajo ej: 3.5 pasaria a 3.0
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        // nos redondea
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        //
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        // nos sacaria el log de n
        double log = Math.log(10);
        System.out.println("log = " + log);

        // nos potencia un n^n
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        // para sacar raiz
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        // Metodos de trigonometria

        double grado = Math.toDegrees(1.57);
        grado = Math.round(grado);
        System.out.println("Convertir de radianes a grado = " + grado);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));
        System.out.println("tan(90): " + Math.tan(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180.00): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));

    }
}
