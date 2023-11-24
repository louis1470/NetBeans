/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millasnauticas;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Millasnauticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double millas;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una distancia en millas nauticas: ");
        millas = entrada.nextDouble();
        double m = millas * 1852;
        System.out.println("La distáncia introducida equivale a " + m + " metros");
    }

}
