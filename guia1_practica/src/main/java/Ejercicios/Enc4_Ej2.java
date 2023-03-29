/*
 *Construir un pseudocódigo que permita ingresar un número, si el número es mayor de
 *500, se debe calcular y mostrar en pantalla el 18% de este.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Enc4_Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double num = leer.nextDouble();
        if (num>500){
            double resultado = num*0.18;
            System.out.println("El 18% de " + num + " Es " + resultado);
        }
    }
    
}
