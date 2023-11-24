/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act13;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int t;
        System.out.print("Cuantos valores quiere crear?: ");
        t = entrada.nextInt();
        int num[] = new int[t], v, inc;
        System.out.print("Dame un valor: ");
        v = entrada.nextInt();
        System.out.print("Dame el incremento: ");
        inc = entrada.nextInt();
        for (int i = 0; i < num.length; i++) {
            num[i] = v;
            System.out.print(num[i] + " ");
            v += inc;
        }
        System.out.println("");
    }
    
}
