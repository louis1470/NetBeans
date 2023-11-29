/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actstr4;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActStr4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String frase, cont;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        System.out.print("Escribe una frase: ");
        frase = entrada.nextLine();
        for (int j = 0; j < frase.length(); j++) {
            switch (frase.toLowerCase().charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }

        }
        System.out.println(a);
        System.out.println(e);
        System.out.println(i);
        System.out.println(o);
        System.out.println(u);

    }

}
