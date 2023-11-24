/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4act18;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T4Act18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double horas, tarifa, salario, impuesto, neto;
        impuesto = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Horas trabajadas esta semana: ");
        horas = entrada.nextDouble();
        System.out.print("Precio hora tarifa: ");
        tarifa = entrada.nextDouble();
        if (horas <= 35) {
            salario = horas * tarifa;
        } else {
            salario = (35 * tarifa + (horas - 35) * tarifa * 1.5);
        }
        if (salario > 900) {
            impuesto = (400 * 0.25) + (salario - 900) * 0.45;
        } else if (salario > 500) {
            impuesto = (salario - 500) * 0.25;
        }
        neto = salario - impuesto;
        System.out.println("El salario neto de " + nombre + " es: " + neto + "€. Impuestos: " + impuesto + "€");

    }

}
