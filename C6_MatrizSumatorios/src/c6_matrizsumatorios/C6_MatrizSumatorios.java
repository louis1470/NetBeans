/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c6_matrizsumatorios;

import java.util.Arrays;

/**
 *
 * @author dam_payne_louis
 */
public class C6_MatrizSumatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos las variables y matrizes
        int max = 1000, min = 100, sumtot = 0;
        int mat[][] = new int[4][5];
        //Creamos el primer for anidado para llenar la matriz, calcular el total de cada fila y el total de todo
        for (int i = 0; i < mat.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < mat[i].length; j++) {
                //Se llena la matriz de valores aleatorios entre 100 y 999
                mat[i][j] = (int) (Math.random() * (max - min) + min);
                sum1 += mat[i][j];
                sumtot += sum1;
                //Se imprimen las filas
                System.out.print(mat[i][j]);
                if (j != mat.length) {
                    System.out.print("\t");
                }
            }
            //Se imprimen las sumas de cada fila
            System.out.print("\t|");
            System.out.println("\t" + sum1);
        }
        System.out.println("-".repeat(53));
        //Creamos el segundo for anidado para calcular el total de cada columna
        for (int i = 0; i <= mat.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < mat.length; j++) {
                sum1 += mat[j][i];
            }
            //Imprimimos las sumas de cada columna
            System.out.print(sum1 + "\t");
            if (i == mat.length) {
                System.out.print("|");
            }
        }
        //Imrimimos el total
        System.out.println("\t" + sumtot);
    }
}
