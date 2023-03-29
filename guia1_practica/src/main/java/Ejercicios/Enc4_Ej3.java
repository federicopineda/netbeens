/*
 Se pide ingresar una letra del alfabeto y mostrar si dicha letra es vocal o consonante.
 */
package Ejercicios;

import java.util.Scanner;


public class Enc4_Ej3 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        letra = letra.toLowerCase();
        if (("a".equals(letra)) || ("e".equals(letra)) || ("i".equals(letra)) || ("o".equals(letra)) || ("u".equals(letra))){
            System.out.println("La letra es una vocal");}
       
        else {
            System.out.println("La letra es una consonante");
        }
            
        
        
    }
    
}
