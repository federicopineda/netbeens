/*
 *Escriba un programa en el cual se ingrese un valor limite positivo, y a
 *continuación solicite números al usuario hasta que la suma de los
 *numeros introducidos supere el límite inicial.
 */
package guia3_practica;

import java.util.Scanner;

public class Ej_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del límite positivo");
        double limite=leer.nextDouble();
        double suma=0;
        do {
            System.out.println("Ingrese un número");
            double num=leer.nextDouble();
            suma=suma+num;
            
            //if (suma>limite)
                //break;
            
        } while (suma<=limite);
        
        System.out.println("La suma de los números es " + suma);
    }
    
}
