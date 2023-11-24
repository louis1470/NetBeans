/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act17extra;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Act17Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora, minuto, segundo;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce las horas: ");
        hora = entrada.nextInt();
        System.out.print("Introduce los minutos: ");
        minuto = entrada.nextInt();
        System.out.print("Introduce los segundos: ");
        segundo = entrada.nextInt();
        if (segundo > 59 || minuto > 59 || hora > 23) {
            System.out.println("Error");
        } else {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    minuto = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
            System.out.println(hora + ":" + minuto + ":" + segundo);
        }

    }

}
