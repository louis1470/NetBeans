/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actstr3;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActStr3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nom, cognom1, cognom2, usr;
        System.out.print("Dime el nombre: ");
        nom = entrada.nextLine();
        System.out.print("Dame el primer apellido: ");
        cognom1 = entrada.nextLine();
        System.out.print("Dame el segundo apellido: ");
        cognom2 = entrada.nextLine();
        usr = nom.substring(0,3);
        usr += cognom1.substring(0,3);
        usr += cognom2.substring(0,3);
        System.out.println(usr.toUpperCase());
    }
    
}
