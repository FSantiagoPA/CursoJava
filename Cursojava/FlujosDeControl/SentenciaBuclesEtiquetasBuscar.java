package consantiagocom.Cursojava.FlujosDeControl;

public class SentenciaBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = " trigotrigo tres tristes tigras tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i <= maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;

        }
        System.out.println("Encontrado = " + cantidad + " veces el palabra '"+palabra+"' en la frase");
    }
}
