/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nota;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insiere la nota: ");
        double nota = entrada.nextDouble();
        if (nota > 10 || nota < 0) {
            System.out.println("Error");
        } else if (nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficient");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Bé");
        } else if (nota >= 6 && nota < 9) {
            System.out.println("Notable");
        } else if (nota == 10) {
            System.out.println("Excel.lent");
        }
    }
}
