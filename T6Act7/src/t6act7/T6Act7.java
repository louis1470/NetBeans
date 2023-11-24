/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act7;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int r = 0;
        System.out.print("Dame un numero: ");
        int p = entrada.nextInt();
        System.out.print("Dame otro numero: ");
        int q = entrada.nextInt();
        if (p > q) {
            r = p;
            p = q;
            q = r;
        }
        int[] num = new int[q - p + 1];
        for (int i = 0; i < num.length; i++) {
            num[i] = p + i;
            System.out.print(num[i] + ", ");
        }
    }
}
