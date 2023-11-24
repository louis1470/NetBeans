/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5act15.pkg1;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T5Act151 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, num3 = 0;
        Scanner entrada = Scanner(System.in);
        System.out.print("Dame una cifra: ");
        n = entrada.nextInt();
        while (n >= 3){
        n = n - 3;
        num3 ++;
        }
        System.out.print("Cantidad de multiples de 3: " + num3);
    }

    

    
    }
    

