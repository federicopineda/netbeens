/*
 Leer la altura de N personas y determinar el promedio de estaturas que
 se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
 general.
 */
package guia3_practica;

import java.util.Scanner;


public class Extra_6 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas ");
        double n=leer.nextDouble();
        double contador=0;
        double altura;
        double sumabajo=0;
        double suma=0;
        double nbajo=0;
        
        do {  
            System.out.println("Ingrese la altura ");
            altura=leer.nextDouble();
            if (altura<1.6){
                
                sumabajo=sumabajo+altura;
                nbajo++;
            } 
            
            suma=suma+altura;
            contador++;
        } while (contador<n);
        
        System.out.println("El promedio de las alturas de las personas por debajo de 1,6 mts es " + sumabajo/nbajo );
        System.out.println("El promedio de todas las personas  es " + (sumabajo+suma)/n );
    }
    
}
