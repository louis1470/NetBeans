/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actstr1;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActStr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String frase;
        String[] frase_dividida;
        System.out.print("Dame una frase: ");
        frase = entrada.nextLine();
        frase_dividida = frase.split(" ");
        System.out.println("La frase dividida es:");
        for (int i = 0; i < frase_dividida.length; i++) {
            System.out.println(frase_dividida[i]);
        }
        
    }
    
}
