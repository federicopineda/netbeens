/*
 *Implementar un programa que le pida dos números enteros al usuario y
 *determine si ambos o alguno de ellos es mayor a 25.
 */
package guia3_practica;

import java.util.Scanner;

public class Ej1_guiateorica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        if ((num1 > 25) && (num2 > 25)){
            System.out.println("Ambos núeros son mayores a 25");}
        else {
            if  ((num1 > 25) || (num2 > 25)){
            System.out.println("Al menos uno de los números es mayor a 25");}
                else {
             System.out.println("Ninguno de los números es mayor a 25");
                
         
            }        
    }
    }
    
}
