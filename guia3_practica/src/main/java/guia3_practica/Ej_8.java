/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 *Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
 */
package guia3_practica;

import java.util.Scanner;

public class Ej_8 {

    public static void main(String[] args) {
        
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos por lado ");
        int elementos=leer.nextInt();
        int m=elementos;
        int n=elementos;
        String matriz[][] = new String[m][n];
        
         //LLenar Matriz       
        for (int i=0; i<m ; i++){
            for(int j=0; j<n; j++){
             if((i==0) || (j==0) || (i==(m-1)) || (j==(n-1))){
                    matriz[i][j]= "*";        
            } else {
                     matriz[i][j]=" ";
             }
            }
        }
         //Imprimir Matriz
         for (int i=0; i<m ; i++){
            for( int j=0; j<n; j++){
                System.out.print(matriz[j][i]);
            }
          System.out.println("");  
   
                                 }
      
    }
}
