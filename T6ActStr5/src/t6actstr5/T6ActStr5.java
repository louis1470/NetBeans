/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actstr5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActStr5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.print("Dame una frase: ");
        frase = entrada.nextLine().replaceAll(" ", "");
        char f1[] = frase.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(f1));
        char f2[] = new char[f1.length];
        for (int i = 0; i < f1.length; i++) {
            f2[f2.length - 1 - i] = f1[i];
        }
        System.out.println(Arrays.toString(f2));
        if (Arrays.equals(f1, f2)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
