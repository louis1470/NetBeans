/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c7_estaturas;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class C7_Estaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        int altmin = 140, altmax = 211;
        System.out.print("Cuantos païses quiere comparar? Deben ser como mínimo 4: ");
        n = entrada.nextInt();
        while (n < 4) {
            System.out.print("El dato introducido es incorrecto. Por favor insiere un valor mayor o igual a 4: ");
            n = entrada.nextInt();
        }
        entrada.nextLine();
        String paises[] = new String[n];
        int alturas[][] = new int[n][10];
        for (int i = 0; i < paises.length; i++) {
            System.out.print("Dime un pais: ");
            paises[i] = entrada.nextLine();
        }
        System.out.println(" ".repeat(64) + "MED MÍN MÁX");
        for (int i = 0; i < alturas.length; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, med = 0;
            System.out.printf("%20s: ", paises[i]);
            for (int j = 0; j < alturas[i].length; j++) {
                alturas[i][j] = (int) (Math.random() * (altmax - altmin) + altmin);
                System.out.print(alturas[i][j] + " ");
                med += alturas[i][j];
                if (alturas[i][j] < min) {
                    min = alturas[i][j];
                }
                if (alturas[i][j] > max) {
                    max = alturas[i][j];
                }
            }
            System.out.print("| " + (med / alturas[i].length) + " " + min + " " + max);
            System.out.println("");

        }
    }

}
