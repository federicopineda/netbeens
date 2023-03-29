/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Ej5 {

 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese un número entero");
    
    double num = leer.nextDouble();
    
     System.out.println("El doble es " + num*2 + " El triple es " + num*3 + " La raíz es " + Math.sqrt(num));
     

        // TODO code application logic here
    }
    
}
