/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4act10;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T4Act10 {

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
        System.out.println("La suma es " + c + ", la resta es " + d + ", la multiplicación es " + e);
        if (a == 0 || b == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
            System.out.println("y la division es " + f);
        }
       

    }

}
