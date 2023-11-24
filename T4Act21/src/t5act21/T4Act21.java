/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act21;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T4Act21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a, b, par = 0;

        System.out.print("Dame el valor de a: ");
        a = entrada.nextInt();
        System.out.print("Dame el valor de b, siendo mayor que a: ");
        b = entrada.nextInt();

        while (a <= b) {
            System.out.print(a + " ");
            if (a % 2 == 0) {
                par++;
            }
            a++;
        }
        System.out.println("\nHan aparecido " + par + " pares");
    }

}
