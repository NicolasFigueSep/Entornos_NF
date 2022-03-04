/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.entornos_nf;

/**
 *
 * @author Alumno Tarde
 */
public class entornos_NF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] matriz ={3,2,4,1,9};
       int [] matrizOrd = ordenaMatriz(matriz);
       for(int e: matrizOrd){
           System.out.println(e);
       }
    }
    /*
        1. Es un metodo para ordenar de menor una matriz de una dimensión.
            El primer error es que J no existe si no que se llama vaya otra variable
            aquiUnosAmigos recogera el valor del elemento siguiente y luego se hará el cambio
            El segundo error es que en el segundo for, el de vayaOtraVariable se
            puede salir del rango de la matriz(accediendo a una posicion negativa)
            El tercer error es que no recorrerá la matriz correctamente.
    Solucion :  He cambiado i por aqui UnaVariable y j por vayaOtraVariable
                j la he inicializado con el valor de i+1 para mirar el siguiente valor
                He cambiado la condicion del segundo bucle para que
                itere las veces necesarias.
                Lo que era [j+1] pasa a ser j
                Lo que era [j] pasa a ser i
                He cambiado aquiUnosAmigos por aux
    */
    public static int [] ordenaMatriz(int[] matriz) {
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i+1; j < matriz.length; j++) {
                if (matriz[j] < matriz[i]) {
                    aux = matriz[j];
                    matriz[j] = matriz[i];
                    matriz[i] = aux;
                }
            }
        }
        return matriz;
    }
}
