    /*
 * Crear un programa que dado un número determine si es par o impar 
 */
package guia3_practica;

import java.util.Scanner;

public class Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num=leer.nextInt();
        
        if (num%2==0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
      
    }
    
}
