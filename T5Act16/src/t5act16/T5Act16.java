/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act16;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T5Act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        int cont;
        boolean primo = false;
        System.out.print("Dame un numero: ");
        n = entrada.nextInt();
        cont = n - 1;
        while (cont != 1) {
            if (n % cont == 0) {
                primo = false;
            }
            cont--;
        
        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
        }
    }
}
