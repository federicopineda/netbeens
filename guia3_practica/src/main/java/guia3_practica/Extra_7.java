/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package guia3_practica;

import java.util.Scanner;

public class Extra_7 {

    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de números a ingresar");
            int n=leer.nextInt();
            double sumatoria=0;
           
            int contador=0;
            double nummin=0;
            double nummax=0;
            int i=0;
            
            do{
             
           // double[] vector= new double[];
                
                System.out.println("Ingrese un número");
                double num=leer.nextDouble();
                if (contador==0){
                    nummax=num;
                    nummin=num;
                }
                        
                
                if (nummax<num){
                    nummax=num;
                }
                if (nummin>num){
                nummin=num;
            }
                contador++;
                sumatoria=sumatoria+num;
            } while (contador<n);
            System.out.println(" El número mínimo es " + nummin + "El número máximo es " + nummax);
            System.out.println("El promedio de los valores ingresados es " + (sumatoria/n));
    }
    
}
