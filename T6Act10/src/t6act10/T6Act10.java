/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act10;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        double max = 0, min = 0, sum = 0;
        int alto = 0, bajo = 0;
        System.out.print("Quantas alturas quiere inserir?: ");
        n = entrada.nextInt();
        double num[] = new double[n];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Dame una altura: ");
            num[i] = entrada.nextDouble();
            max = num[i];
            min = num[i];
            sum += num[i];
        }
        
        double media = sum / num.length;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > media) {
                alto++;
            }
            if (num[i] < media) {
                bajo++;
            }
        }
        System.out.print("La altura media es: ");
        System.out.printf("%.2f %n",media);
        System.out.println("La altura mas alta es: " + max);
        System.out.println("La altura mas baja es: " + min);
        System.out.println("La cantidad de personas por arriba de la media es: " + alto);
        System.out.println("La cantidad de personas por debajo de la media es: " + bajo);
    }

}
