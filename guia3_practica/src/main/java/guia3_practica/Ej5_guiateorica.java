/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 *el número ingresado seguido de tantos asteriscos como indique su valor. Por
 *ejemplo:
 */
package guia3_practica;

import java.util.Scanner;


public class Ej5_guiateorica {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int contador=0;
        
       while (contador<4){
        
        System.out.println("Esciba un número entero entre 1 y 20");
        int num=leer.nextInt();
        
        if ((num<0) || (num>20)){
            System.out.println("Número fuera de rango ");
            
        }else {
           
            System.out.print(num);
       
      
            for (int i=0; i<num; i++){
            
            
            System.out.print("*");
        } 
            contador=contador+1;
        }
       System.out.println(" ");    
    } 
    }        
    } 
        
      

