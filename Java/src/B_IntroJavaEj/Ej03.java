package B_IntroJavaEj;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.next();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }
    
}
