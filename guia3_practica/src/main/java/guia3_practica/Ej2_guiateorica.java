/*
Ejercicio 7
Considera que estás desarrollando una web para una empresa que fabrica
motores (suponemos que se trata del tipo de motor de una bomba para mover
fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
 mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”
 */
package guia3_practica;

import java.util.Scanner;

public class Ej2_guiateorica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el mumero de motor indicado a la izquierda del mismo");
        
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
                
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
                
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
                
            default:
                System.out.println("No existe un valor válido para este tipo de bomba");
        }
    }
    
}
