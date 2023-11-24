/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descompte;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Descompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioart, precioventa;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        precioart = entrada.nextInt();
        System.out.print("Introduce el precio de venta: ");
        precioventa = entrada.nextInt();
        float descuento = (float) (((precioart - precioventa) * 100) / precioart);
        System.out.println("El descuento es " + descuento + "%");
    }

}
