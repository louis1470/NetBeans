/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act9;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double max = 10, min = 1;
        double num[] = new double[100];
        System.out.print("Dame un numero entre el 1 y el 9: ");
        int r = entrada.nextInt();
        System.out.println("Hay un " + r + " en las celdas: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (max - min)) + min;
            if (num[i] == r) {
                System.out.println(i);

            }
        }

    }

}
