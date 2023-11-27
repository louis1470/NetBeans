/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act16;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int v, cont = 0;
        int num1[] = new int[10];
        int num2[] = new int[10];
        for (int i = 0; i < num1.length; i++) {
            System.out.print("Dame un valor: ");
            v = entrada.nextInt();
            num1[i] = v;
        }
        for (int i = 0; i < num1.length; i++) {
            System.out.print("Dame un valor: ");
            v = entrada.nextInt();
            num2[i] = v;
        }
        if (Arrays.equals(num1, num2) == true) {
            System.out.println("son iguals");
        } else {
            System.out.println("No son iguals");
        }
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
    
}
