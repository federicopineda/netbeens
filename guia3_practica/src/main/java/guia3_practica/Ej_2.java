/*
 *Crear un programa que pida una frase y si esta es igual a "eureka" el programa de un mensaje de Correcto
 *sino mostrara un mensaje de incorrecto
*/
package guia3_practica;

import java.util.Scanner;

public class Ej_2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("CORRECTO");
        
    
        }   else {
            System.out.println("Incorrento");
                 }
    
    }
}