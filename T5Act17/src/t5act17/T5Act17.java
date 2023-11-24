/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act17;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T5Act17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num1, num2 = 0, fallo = 0, cont = 0;
        
        System.out.print("Dame un numero: ");
        num1 = entrada.nextInt();
        
        while (num2 != 0) {
            
            System.out.print("Dame un numero: ");
            num2 = entrada.nextInt();
            cont ++;
            if (num1 > num2) {

                System.out.print("Dame un numero: ");
                num1 = entrada.nextInt();
                num2 = num1;
            } else {
                System.out.println("Fallo, es menor o igual");
                fallo++;
            }
            cont ++;
        }
    }

}


