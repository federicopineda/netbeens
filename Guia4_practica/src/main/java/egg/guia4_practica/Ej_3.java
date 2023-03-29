/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia4_practica;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        int moneda;
        float cantidadEuros;
        
        System.out.println("Ingrese el tipo de moneda a cambiar");
        System.out.println("1- Dolar");
        System.out.println("2- Libras");
        System.out.println("3- Yenes");
        moneda=leer.nextInt();
        
        System.out.println("Ingrese la cantida a cambiar: ");
        cantidadEuros=leer.nextFloat();
        Conversor(moneda, cantidadEuros);
    }
    
    //Funcion de conversion
    public static void Conversor(int tipoDeCambio, float cantidad){
        switch (tipoDeCambio) {
            case 1:
                System.out.println("El equivalente en dolares es " + (cantidad*1.28611));
                break;
            case 2: 
                System.out.println("El equivalente en Libras es " + (cantidad*0.86));
                break;
            case 3:
                System.out.println("El equivalente en Yenes es " + (cantidad*129.852));
                break;
        }
    }
    
}
