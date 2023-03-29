/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo,
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package egg.guia4_practica;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       boolean resultado;
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
       
        resultado=Primo(num);
        
        System.out.println(resultado);
        
    }
    
       public static boolean Primo(int numero){
        int cont = 2;
        boolean primo=true;
        while ((primo) && (cont!=numero)){
             if (numero % cont == 0)
                primo = false;
                cont++;
        }
            return primo;
        }    
   

      }
    

  
    

