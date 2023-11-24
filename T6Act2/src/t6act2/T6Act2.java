/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act2;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma = 0;
        double numeros[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dame un numero: ");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }
        System.out.println("la suma es: " +suma);
        
    }
    
}
