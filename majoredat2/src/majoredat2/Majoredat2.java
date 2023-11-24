/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package majoredat2;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Majoredat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edat;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        edat = entrada.nextInt();
        if (edat < 0) {
            System.out.println("Error");
        } else if (edat >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

}
