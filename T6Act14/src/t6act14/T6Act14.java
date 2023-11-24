/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, m;
        System.out.print("Dame la grandaria del array: ");
        n = entrada.nextInt();
        int num[] = new int[n];
        System.out.print("Dame el numero con el que lo quieres rellenar: ");
        m = entrada.nextInt();
        Arrays.fill(num, m);
        System.out.println(Arrays.toString(num));
    }
    
}
