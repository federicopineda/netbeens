/*
*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
*y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package guia3_practica;

import java.util.Scanner;

public class Ej3_guiateorica {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        double nota=leer.nextDouble();
        
        while ((nota<0) || (nota>10)){
            System.out.println("Ingrese una nota válida");
            nota=leer.nextDouble();
            
    }
    System.out.println("La nota está validada");
    }
    
} 
