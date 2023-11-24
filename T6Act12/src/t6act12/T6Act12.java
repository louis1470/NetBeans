/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act12;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[10];
        char r1;
        boolean bucle = true;
        int r2 = 0, r3 = 0;
        while (bucle) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Seleciona una opción: ");
            r1 = entrada.nextLine().charAt(0);
            switch (r1) {
                case 'a':
                    for (int i = 0; i < num.length; i++) {
                        System.out.print(num[i] + " ");
                    }
                    System.out.println("");
                    break;
                case 'b':
                    System.out.print("Dime una cantidad: ");
                    r2 = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Dime una posición: ");
                    r3 = entrada.nextInt();
                    entrada.nextLine();
                    if (r3 > 0 && r3 < 10) {
                        int i = r3 - 1;
                        num[i] = r2;
                    } else {
                        System.out.println("Error");

                    }
                    break;
                case 'c':
                    bucle = false;
                    break;
                default:
                    System.out.println("Error");

            }
        }
    }
}
