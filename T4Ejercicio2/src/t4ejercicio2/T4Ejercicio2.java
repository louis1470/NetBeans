/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        numero = entrada.nextDouble();
        if (numero >= 0) {
            System.out.println("Numero positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        }
    }

}
