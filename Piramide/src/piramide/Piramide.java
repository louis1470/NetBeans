/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, cif;
        System.out.print("Dame un numero del 1 al 9: ");
        n = entrada.nextInt();
        System.out.print("Para generarlo con asteriscos pulse 1, para cifras pulse 2:  ");
        cif = entrada.nextInt();
        // Creamos el bucle para que salgan las filas que insertamos en la variable n anteriormente
        for (int i = 1; i <= n; i++) {
            // Creamos el bucle para calcular y generar la cantidad de espacios que necesita cada fila
            // Para calcularlo restamos la variable i a la variable n, para crear una media piramide inversa de espacios
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Creamos el bucle para calcular y generar los asteriscos o cifras
            // Para calcularlo multiplicamos la variable i por 2 y le restamos una. 
            // De este modo creamos un numero par que se incrementa por 2 y al restarle 1 creamos un numero impar que se incrementa por 2
            for (int k = 1; k <= (i * 2) - 1; k++) {
                // Creamos un if y un else para cambiar entre asteriscos y cifras dependiendo de lo que diga el usuario
                if (cif == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }

            }
            System.out.println("");
        }

    }

}
