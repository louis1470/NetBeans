/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act20;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T5Act20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n = 0, cont1 = 0, cont2 = 0;
        
        System.out.print("Dame un numero del 1 al 20: ");
        n = entrada.nextInt();
        
        while (cont1 < n) {
            cont1++;
            while (cont2 < cont1) {
                System.out.print(cont1);
                cont2++;
            }
            System.out.println("");
            cont2 = 0;
        }

    }

}
