package consantiagocom.Cursojava.TipoStringCadenas;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10; // 14 + 8 + 66.6 = 88.6666666666667
        System.out.println("promedio = " + promedio);

        promedio = --i + j++ + k / 3d * 10; // (15 + 8) + 6.6 * 10 = 89.6666667
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
