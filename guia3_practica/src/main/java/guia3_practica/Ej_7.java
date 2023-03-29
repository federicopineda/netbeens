/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package guia3_practica;

import java.util.Scanner;


public class Ej_7 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int contadorbien=0; int contadormal=0;
        boolean bol1;
        boolean bol2;
        boolean bol3;
        //Las variables boleanas inician en falso
        String cadena;   
        do {
            System.out.println("Ingrese una cadena");
            cadena= leer.nextLine();
            int longitud=cadena.length();
            bol1= cadena.endsWith("O");
            bol2= cadena.startsWith("X");
            bol3=longitud<=5;
            if (bol1 & bol2 & bol3) {
                    contadorbien++;
            } else{
                    if (!cadena.equals("&&&&&")){
                    contadormal++;
         
                    }
                    
            }
       
        } while (!cadena.equals("&&&&&"));
            
        System.out.println("La cantidad de ingresos correctos es " + contadorbien);
        System.out.println("La cantidad de ingresos incorrectos es " + contadormal);
       
    }
}

