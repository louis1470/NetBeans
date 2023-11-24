/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act3;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double max = -1999999999, min = 1999999999;
        double numeros[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dame un numero: ");
            numeros[i] = entrada.nextDouble();
            if(numeros[i] < min){
            min = numeros[i];
            } else if(numeros[i] > max){
                max = numeros[i];
            } else {}
        }
        System.out.println("Max: " + max + ". Min: " + min);
    }
    
}
