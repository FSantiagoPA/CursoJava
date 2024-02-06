package consantiagocom.Cursojava.TipoStringCadenas;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println("largo = " + arreglo[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.jsf";
        String[] archivoArr = archivo.split("\\."); // [.]
        l = archivoArr.length;
        for (int j = 0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("Extencion = " + archivoArr[l-1]);
    }
}
