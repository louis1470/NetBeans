/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act19;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T5Act19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n = 0, cont = 0;
        System.out.print("Dame un numero: ");
        n = entrada.nextInt();
        while (n > cont) {
            if (n == 0) {
                System.out.println("");
            } else {
                System.out.print("*");
                cont++;
            }
        }
        if (n < 0) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
