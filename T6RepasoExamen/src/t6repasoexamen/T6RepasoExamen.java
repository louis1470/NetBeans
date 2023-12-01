/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6repasoexamen;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6RepasoExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int i, c1 = 0, max = 10000;
        double c2 = 0;
        for ( i = 0; c1 < max; i++) {
            System.out.print("Dame un numero: ");
            c2 = entrada.nextDouble();
            c1 += c2;
        }
        System.out.println("La media es: " + (c1/i));
        System.out.println("El total acumulado es: " + c1);
        System.out.println("La cantidad de numeros inseridos es: " + i);
    }
    
}
