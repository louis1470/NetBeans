/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escacs_louis_payne;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class Escacs_Louis_Payne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Creamos las variables
        int n, min = 2;
        boolean bucle = true;
        float cont = 0;
        System.out.print("Dona'm la quantitat màxima de jugadors: ");
        n = entrada.nextInt();
        //Creamos un bucle para que se repita la pregunta si das un valor incorrecto
        while (n <= min) {
            System.out.println("Error");
            System.out.print("Dona'm la quantitat màxima de jugadors: ");
            n = entrada.nextInt();
        }
        //Creamos los arrays
        String nom[] = new String[(int) (Math.random() * (n - (min + 1)) + (min + 1))];
        float punt[] = new float[nom.length];
        int superat[] = new int[nom.length];
        entrada.nextLine();
        //Inizializamos el bucle para que se repitan las preguntas para cada participante 
        for (int i = 0; i < nom.length; i++) {
            System.out.print("Nom: ");
            nom[i] = entrada.nextLine();
            System.out.print("Nota entre 1.0 y 2.0: ");
            punt[i] = entrada.nextFloat();
            cont += punt[i];
            //Creamos el bucle por si el error introducido es incorrecto
            while (punt[i] < 1 || punt[i] > 2) {
                System.out.println("Error");
                System.out.print("Nota entre 1.0 y 2.0: ");
                punt[i] = entrada.nextFloat();
            }
            bucle = true;
            //Creamos el bucle con un switch por si el valor introducido es incorrecto
            while (bucle) {
                System.out.print("Ha superat la fase previa del torneig? Indicau amb 1 per a superat o  2 per a insuperat: ");
                superat[i] = entrada.nextInt();
                switch (superat[i]) {
                    case 1:
                        bucle = false;
                        break;
                    case 2:
                        bucle = false;
                        break;
                    default:
                        System.out.println("Error");
                }

            }
            entrada.nextLine();

        }
        System.out.println("");
        System.out.println("######### RESULTATS #########");
        System.out.println("Total jugadors = " + nom.length);
        System.out.print("Puntuació mitjana = ");
        System.out.printf("%.2f %n", (cont / nom.length));
        System.out.println("");
        System.out.println("//// Nom i puntuacions de tots els jugadors ////");
        //Creamos un bucle para imprimir los datos de todos los usuarios
        for (int j = 0; j < nom.length; j++) {
            System.out.print(nom[j].toLowerCase() + " ha aconseguit ");
            System.out.printf("%.3f", punt[j]);
            System.out.print(" punts\n");
        }
        System.out.println("");
        System.out.println("//// Només els jugadors que han superat la fase prèvia ////");
        //Creamos un bucle para mostrar los datos de los jugadores que han superado la fase previa
        for (int i = 0; i < nom.length; i++) {
            if (superat[i] == 1) {
                System.out.print(nom[i].toLowerCase() + " ha aconseguit ");
                System.out.printf("%.3f", punt[i]);
                System.out.print(" punts\n");
            }
        }

    }

}
