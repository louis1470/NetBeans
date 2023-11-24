/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ejemplo1;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T4Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double a, b;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        a = entrada.nextInt();
        System.out.print("Dame otro numero: ");
        b = entrada.nextInt();
        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;
        System.out.println("La suma es " + c + ", la resta es " + d + ", la multiplicación es " + e + " y la división es " + f + ".");

    }

}
