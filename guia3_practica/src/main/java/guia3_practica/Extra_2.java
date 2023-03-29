/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3_practica;

import java.util.Scanner;

public class Extra_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Variable  A");
        int A=leer.nextInt();
         System.out.println("Variable B");
        int B=leer.nextInt();
         System.out.println("Variable C");
        int C=leer.nextInt();
         System.out.println("Variable D");
        int D=leer.nextInt();
        System.out.println(A + " " + B + " "+ C + " " +D);
        int aux;
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
       System.out.println(A + " " + B + " "+ C + " " +D);
    }
    
                                    
                           
}
