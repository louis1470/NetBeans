/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actstr2;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActStr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String s1, s2;
        System.out.print("Escribe una frase: ");
        s1 = entrada.nextLine();
        System.out.print("Dame otra frase: ");
        s2 = entrada.nextLine();
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    
}
