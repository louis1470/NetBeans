/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6repasoexamen2;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6RepasoExamen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Altura de la U: ");
        n = entrada.nextInt();
        while (n <= 2) {
            System.out.println("Error");
            System.out.print("Altura de la U: ");
            n = entrada.nextInt();

        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

}
