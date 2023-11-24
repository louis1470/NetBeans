/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act14billets;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T5Act14Billets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner respuesta = new Scanner(System.in);
        int b5 = 0, b10 = 0, b20 = 0, b50 = 0, b100 = 0, b200 = 0, b500 = 0, n;
        System.out.print("Dame una cifra: ");
        n = respuesta.nextInt();
        while (n > 0) {
            if (n >= 500) {
                n = n - 500;
                b500++;
            } else if (n >= 500) {
                n = n - 500;
                b500++;
            } else if (n >= 200) {
                n = n - 200;
                b200++;
            } else if (n >= 100) {
                n = n - 100;
                b100++;
            } else if (n >= 50) {
                n = n - 50;
                b50++;
            } else if (n >= 20) {
                n = n - 20;
                b20++;
            } else if (n >= 10) {
                n = n - 10;
                b10++;
            } else if (n >= 5) {
                n = n - 5;
                b5++;
            }
        }
        if (n < 0) {
            System.out.print("Error");
        }
        System.out.println("Tu cambio: "
                + b500 + " Billetes de 500, "
                + b200 + " Billetes de 200, "
                + b100 + " Billetes de 100, "
                + b50 + " Billetes de 50, "
                + b20 + " Billetes de 20, "
                + b10 + " Billetes de 10, "
                + b5 + " Billetes de 5, ");

    }

}
