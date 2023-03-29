
package guia3_practica;

import java.util.Scanner;

public class Ej_4b {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);  
        
        System.out.println("ingresa una frase o palabra"); 
        
        String frase = read.next().toUpperCase();     
        
        String letra = frase.substring(0,1);     
        
        if ("A".equals(letra)){
            
        System.out.println("CORRECTO");            
        }else{    
            
            System.out.println("INCORRECTO");         
        }
    }
    
}
