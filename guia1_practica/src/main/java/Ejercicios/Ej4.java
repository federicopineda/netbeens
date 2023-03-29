/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Ej4 {


    public static void main(String[] args) {
        
      
        
          Scanner leer = new Scanner(System.in);
          
          System.out.println("Grados Centigrados");
          
          double centigrados = leer.nextDouble();
          
          double farenheit = 32 + 9 * centigrados / 5;
          
          System.out.println("Farenheit = " + farenheit);
        // TODO code application logic here
    }
    
}
