package consantiagocom.Cursojava.ValorvsReferencia;

class Persona{
    private String nombre;

    public void  modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("iniciamos el main con");

        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Finaliza el metodo main con los datos de la perosaona modificados! ");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test con");
        persona.modificarNombre("pepe");
        System.out.println("Finaliza el metodo test");
    }
}
