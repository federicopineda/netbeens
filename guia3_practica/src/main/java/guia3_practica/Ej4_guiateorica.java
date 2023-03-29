/*
 *Escriba un programa que lea 20 números. Si el número leído es igual a cero se
 *debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
 *programa deberá calcular y mostrar el resultado de la suma de los números
 *leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
 *de la sentencia break.
 */
package guia3_practica;

import java.util.Scanner;


public class Ej4_guiateorica {

  
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int contador=0;
     double suma=0;
     do {
         System.out.println("Ingrese un número");
         double num=leer.nextDouble();
         if (num==0){
             System.out.println("Se capturó el numero cero");
             break;
             }
         if (num>0){
             suma=suma+num;
             }
         contador++;
         
    }while (contador<20);
     
    System.out.println("La suma de los números es " + suma);
     }   
    
}
