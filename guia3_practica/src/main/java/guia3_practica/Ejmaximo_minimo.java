/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3_practica;

/**
 *
 * @author Federico
 */
public class Ejmaximo_minimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] lista = new int[100]; // Lista de números enteros que supondremos llena.
		int maximo = lista[0]; // Declaramos e inicializamos el máximo.
		int minimo = lista[0]; // Declaramos e inicializamos el máximo.

		for (int i = 0; i < 100; i++){
			if (maximo < lista[i])
				maximo = lista[i];
			if (minimo > lista[i])
				minimo = lista[i];
		}

		// Al finalizar el bucle, las variables contienen los valores máximos y mínimos.
		System.out.println("La máximo de la lista es " + maximo);
		System.out.println("La mínimo de la lista es " + minimo);
	}
}

     /***   for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    System.out.println("Introduzca el elemento [" + x + "," + y + "]");
    matriz[x][y] = consola.nextInt();
    * ***/
  }
}

Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los minutos");
        int tiempo = leer.nextInt();
        int dia = 0;
        int hora = 0;
        int minutos = 0;
        
        while (tiempo > 0){
           if (tiempo >= 1440){
               dia++;
               tiempo = tiempo - 1440;
           } else if (tiempo >= 60){
               hora++;
               tiempo = tiempo - 60;
           } else {
               minutos++;
               tiempo = tiempo - 1;
           }
        }

        System.out.println("Segun los minutos ingresados: es " + dia + " dias y " + hora + " horas");