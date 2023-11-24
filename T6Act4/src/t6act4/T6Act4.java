/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act4;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        double pos = 0, neg = 0;
        double num[] = new double[20];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Dame un numero: ");
            num[i] = entrada.nextDouble();
            if (num[i] >= 0) {
                pos += num[i];
            } else {
             neg += num[i];    
            }
        }
        System.out.println("La suma de los positivos es " + pos + " y la suma de los negativos es " + neg);
    }
    
}
