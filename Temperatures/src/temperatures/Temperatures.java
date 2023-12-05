/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatures;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String mesos[] = new String[12];
        mesos[0] = "   Gener";
        mesos[1] = "  Febrer";
        mesos[2] = "    Març";
        mesos[3] = "   Abril";
        mesos[4] = "    Maig";
        mesos[5] = "    Juny";
        mesos[6] = "  Juliol";
        mesos[7] = "   Agost";
        mesos[8] = "Setembre";
        mesos[9] = " Octubre";
        mesos[10] = "Novembre";
        mesos[11] = "Desembre";
        double temperatura[] = new double[12];
        for (int i = 0; i < mesos.length; i++) {
            System.out.print("Dona'm la temperatura del mes de " + mesos[i] + ": ");
            temperatura[i] = entrada.nextDouble();
        }
        System.out.println("");
        System.out.println("//// TEMPERATURES DELS MESOS ////");
        for (int i = 0; i < mesos.length; i++) {
            System.out.print(mesos[i] + " |");
            for (int j = 0; j <= temperatura[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.printf("%.2f", temperatura[i]);
            System.out.print(" ºC");
            System.out.println("");
        }
    }

}
