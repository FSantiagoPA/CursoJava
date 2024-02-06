package consantiagocom.Cursojava.Wrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal!";

         Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackage());
        System.out.println("strClass = " + strClass);

        for (Method metodo : strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        System.out.println();

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());
        System.out.println("intClass = " + objClass);

        for (Method metodo : objClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }
    }
}
