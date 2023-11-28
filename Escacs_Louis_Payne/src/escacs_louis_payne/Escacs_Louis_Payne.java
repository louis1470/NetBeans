/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escacs_louis_payne;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Escacs_Louis_Payne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, min = 2;
        boolean bucle = true;
        float cont = 0;
        System.out.print("Dona'm la quantitat màxima de jugadors: ");
        n = entrada.nextInt();
        while (n <= min) {
            System.out.println("Error");
            System.out.print("Dona'm la quantitat màxima de jugadors: ");
            n = entrada.nextInt();
        }
        String nom[] = new String[(int) (Math.random() * (n - (min + 1)) + (min + 1))];
        float punt[] = new float[nom.length];
        int superat[] = new int[nom.length];
        entrada.nextLine();
        for (int i = 0; i < nom.length; i++) {
            System.out.print("Nom: ");
            nom[i] = entrada.nextLine();
            System.out.print("Nota entre 1.0 y 2.0: ");
            punt[i] = entrada.nextFloat();
            cont += punt[i];
            while (punt[i] < 1 || punt[i] > 2) {
                System.out.println("Error");
                System.out.print("Nota entre 1.0 y 2.0: ");
                punt[i] = entrada.nextFloat();
            }
            bucle = true;
            while (bucle) {
                System.out.print("Ha superat la fase previa del torneig? Indicau amb 1 per a superat o  2 per a insuperat: ");
                superat[i] = entrada.nextInt();
                switch (superat[i]) {
                    case 1:
                        bucle = false;
                        break;
                    case 2:
                        bucle = false;
                        break;
                    default:
                        System.out.println("Error");
                }

            }
            entrada.nextLine();

        }
        System.out.println("");
        System.out.println("######### RESULTATS #########");
        System.out.println("Total jugadors = " + nom.length);
        System.out.println("Puntuació mitjana = " + (cont / nom.length) + "\n");
        System.out.println("//// Nom i puntuacions de tots els jugadors ////");
        for (int j = 0; j < nom.length; j++) {
            System.out.println(nom[j] + " ha aconseguit " + punt[j] + " punts");

        }
        System.out.println("");
        System.out.println("//// Només els jugadors que han superat la fase prèvia ////");
        for (int i = 0; i < nom.length; i++) {
            if (superat[i] == 1) {
                System.out.println(nom[i] + " ha aconseguit " + punt[i] + " punts");
            }
        }

    }

}
