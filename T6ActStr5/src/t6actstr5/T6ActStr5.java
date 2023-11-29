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
        int c1 = 0, c2 = 0;
        System.out.print("Dame una frase: ");
        frase = entrada.nextLine();
        char f1[] = frase.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(f1));
        for (int i = 0; i < frase.length(); i++) {
            
            switch (f1[i]) {
                case ' ':
                    break;
                default:
                    c1++;

            }
        }
        char f2[] = new char[c1];
        for (int j = 0; j < frase.length(); j++) {
            switch (f1[j]) {
                case ' ':
                    c2++;
                    break;
                default:
                    f2[j - c2] = f1[j];

            }
        }
        System.out.println(Arrays.toString(f2));
        char f3[] = new char[f2.length];
        for (int i = 0; i < f2.length; i++) {
            f3[f3.length - 1 - i] = f2[i];
        }
        System.out.println(Arrays.toString(f3));
        if(Arrays.equals(f2, f3) == true){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
