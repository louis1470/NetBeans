/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act8;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        double num[] = new double[100];
        System.out.print("Dame un numero entre el 0 y el 1: ");
        double R = entrada.nextDouble();
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.random();
            System.out.printf("%.2f %n",num[i]);
            // %n = \n = Salto de linea
            if (num[i] >= R) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " numeros mayores o iguales que el introducido.");
    }

}
