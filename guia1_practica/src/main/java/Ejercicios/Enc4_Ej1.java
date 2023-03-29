/*
Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
mostrar un mensaje por pantalla indicándolo.
 */
package Ejercicios;

import java.util.Scanner;

public class Enc4_Ej1 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el sueldo actual");
        double sueldoactual = leer.nextDouble();
        System.out.println("Ingrese el sueldo minimo");
        double sueldominimo = leer.nextDouble();
        
        if (sueldoactual>sueldominimo) {
                System.out.println("El sueldo es mayor al mínimo");
        } else {
                System.out.println("Cobras poco hermano");
        }
        // TODO code application logic here
    }
    
}
