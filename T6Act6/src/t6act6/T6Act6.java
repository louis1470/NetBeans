/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act6;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        double m;
        System.out.print("Dame la grandaria del array: ");
        n = entrada.nextInt();
        double num[] = new double[n];
        System.out.print("Con que numero quieres rellenar el array: ");
        m = entrada.nextDouble();
        for (int i = 0; i < num.length; i++) {
            num[i] = m;
            System.out.println(num[i]);
        }
    }

}
