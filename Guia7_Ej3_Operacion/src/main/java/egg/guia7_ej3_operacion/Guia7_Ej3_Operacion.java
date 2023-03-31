/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.guia7_ej3_operacion;

import Entidad.Operacion;

/**
 *
 * @author Federico
 */
public class Guia7_Ej3_Operacion {

    public static void main(String[] args) {
        Operacion calculo1 = new Operacion();
        calculo1.crearOperacion();
        System.out.println("La suma es "+calculo1.sumar()+"La resta es "+calculo1.restar());
        System.out.println("La multiplicación es "+calculo1.multiplicar()+"La división es "+calculo1.dividir());
}
}