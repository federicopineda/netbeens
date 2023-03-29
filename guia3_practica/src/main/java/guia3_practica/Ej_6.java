/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

 */
package guia3_practica;

import java.util.Scanner;

public class Ej_6 {


    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        double num1=leer.nextInt();
        double num2=leer.nextInt();
        int opcion;
        do {
            System.out.println("MENU"); 
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opción");
            
            opcion=leer.nextInt();
             
            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + (num1+num2));
                    System.out.println(" ");
                    break;
                 case 2:
                    System.out.println("La resta es " + (num1-num2));
                    System.out.println(" ");
                    break;
                 case 3:
                    System.out.println("La multiplicación es " + (num1*num2));
                    System.out.println(" ");
                    break;
                 case 4:
                    System.out.println("La división es " + (num1/num2));
                    System.out.println(" ");
                    break;
                 case 5:
                        
                    break;
                    
                default: 
            
                System.out.println("Ingrese una opción válida");
                System.out.println(" ");
            }   
                
            
           
        
            }while (opcion!=5);
        
        System.out.println("El programa finalizo");
    }
    
}
