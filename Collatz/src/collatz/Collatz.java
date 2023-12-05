/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collatz;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Donà'm un numero major a 1: ");
        num = entrada.nextInt();
        while (num <= 1) {
            System.out.print("Error amb el numero introduït. Introduïx un numero major a 1: ");
            num = entrada.nextInt();
        }
        System.out.print(num);
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                System.out.print("  " + num);
            } else {
                num = num * 3 + 1;
                System.out.print("  " + num);
            }

        }
        System.out.println("");
    }

}
