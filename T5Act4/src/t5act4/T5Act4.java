/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act4;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T5Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0, numero;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Dame un numero: ");
        numero = entrada.nextInt();
        while (cont <= numero){
            System.out.println(cont);
            cont ++;
        }
        
    }
    
}
