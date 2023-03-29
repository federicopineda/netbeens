/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia3_practica;

import java.util.Scanner;

public class Extra_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos=leer.nextInt();
        double dias=Math.floor((minutos/1440));
        double horas=Math.floor(((minutos-(dias*1440))/60));
     
        System.out.println(dias + " día " + horas + " horas ");
    }
    
}
//Math.round 
//Math.floor
//Math.ceil