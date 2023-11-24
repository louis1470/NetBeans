/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo8;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Ejemplo8 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        double c, a;
        
       
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduce el radio sobre el que quiere calcular el area y la circunferencia: ");
        double radio = entrada.nextDouble();
        c = Math.pow(radio, 2) * Math.PI;
        a = 2 * Math.PI * radio;
        System.out.println("La circunferencia es "+c+" y el area es "+a+".");
        
        
        
        
                
        
    }
    
}
