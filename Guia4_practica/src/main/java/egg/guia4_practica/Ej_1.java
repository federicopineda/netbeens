package egg.guia4_practica;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Federico
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        double num1=leer.nextDouble(), num2=leer.nextDouble();
        
        
        System.out.println("Elija una operación a realizar");
        System.out.println("1-SUMAR");
        System.out.println("2-RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        
        int opcion=leer.nextInt();
        
        switch (opcion) {
            case 1:
                   double retorno=sumar(num1,num2);
                   System.out.println("La suma es " + retorno);
                break;
                
            case 2:
                   retorno=restar(num1,num2);
                   System.out.println("La suma es " + retorno);
                break;
                
            default:
                throw new AssertionError();
        }
    }
    
    public static double sumar(double num1, double num2) {
    	double suma;
            suma = num1 + num2;
    	return suma;
	}

      public static double restar(double num1, double num2) {
    	double resta;
    	resta = num1 - num2;
    	return resta;
	}
}
