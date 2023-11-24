/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4act14;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T4Act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        a = entrada.nextDouble();
        System.out.print("Dame otro numero: ");
        b = entrada.nextDouble();
        if (a < b) {
            System.out.println(b + " es major");
        } else if (a == b) {
            System.out.println("Son iguals");
        } else {
            System.out.println(a + " es major");
        }
    }

}
