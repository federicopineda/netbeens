/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos 
números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta 
es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package guia3_practica;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Extra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
       int num1= (int) (Math.random()*10);
       int num2= (int) (Math.random()*10);
       int adivina; 
       do {
        System.out.println("Ingrese el resultado que ud piensa amigo");
        adivina=leer.nextInt();
        
        
       } while (adivina!=num1*num2);
       
        System.out.println("Aldana Gano!!! ");
        System.out.println(num1 + "x" + num2 + "=" + num1*num2);
    }   
    
}
