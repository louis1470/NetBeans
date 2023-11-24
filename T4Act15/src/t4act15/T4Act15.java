/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4act15;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T4Act15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        a = entrada.nextDouble();
        System.out.print("Dame otro numero: ");
        b = entrada.nextDouble();
        System.out.print("Dame otro numero: ");
        c = entrada.nextDouble();
        if (a > b && a > c) {
            System.out.println(a + " es major");
        } else if (b > a && b > c) {
            System.out.println(b + " es major");
        } else if (c > a && c > b) {
            System.out.println(c + " es major");
        } else {
            System.out.println("son iguals");
        }
    }

}
