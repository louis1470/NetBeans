/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actmat3;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActMat3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, m, menor = 0, major = 0, zero = 0;
        System.out.print("Dame el tamaño de las filas del array: ");
        n = entrada.nextInt();
        System.out.print("Dame el tamaño de las columnas del array: ");
        m = entrada.nextInt();
        int array1[][] = new int[n][m];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print("Dame un valor de la fila: " + (i+1) + " columna: " + (j+1) + " : ");
                array1[i][j] = entrada.nextInt();
                if (array1[i][j] < 0) {
                    menor++;
                }else if (array1[i][j] > 0) {
                    major++;
                }else{
                    zero++;
                }
                
            }
        }
        System.out.println("Hay " + major + " mayores a 0, " + menor + " menores a 0 y " + zero + " iguales a 0");
    }
    
}
