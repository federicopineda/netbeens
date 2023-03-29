/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento)y determine el importe en efectivo a pagar por dicho
socio.
 */
package guia3_practica;

import java.util.Scanner;


public class Extra_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese e tipo de socio a la que corresponde");
        String tipo=leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        double costoreal=leer.nextDouble();
        tipo=tipo.toUpperCase();
        double costodesc;
        switch (tipo) {
            case "A":
                    costodesc=costoreal*0.5;
                    System.out.println("El costo con descuento es $ " + costodesc);
                break;
            case "B":
                    costodesc=costoreal*0.65;
                    System.out.println("El costo con descuento es $ " + costodesc);
                break;
            case "C":
                    costodesc=costoreal;
                    System.out.println("El costo con descuento es $ " + costodesc);
                break;    
            default:
                System.out.println("Ingrese un tipo de afiliado válido");
        }
        
    }   
     
        
}
