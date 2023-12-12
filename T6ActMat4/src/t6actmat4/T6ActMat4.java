/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actmat4;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActMat4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float notes[][] = new float[3][2];
        float  mitja[] = new float[notes.length], maxtot[] = new float[notes.length], mintot[] = new float[notes.length];
        for (int i = 0; i < notes.length; i++) {
            float sum = 0;
            for (int j = 0; j < notes[i].length; j++) {             
                System.out.print("Introduce la nota " + (j+1) + " del alumno " + (i+1) + " : ");
                notes[j][i] = entrada.nextFloat();
                if (notes[i][j] > maxtot[i]) {
                    maxtot[i] = notes[i][j];
                }else if (notes[i][j] < mintot[i]) {
                    mintot[i] = notes[i][j];
                }
            sum += notes[j][i];
            }
            mitja[i] = sum/notes[i].length;
        }
        for (int i = 0; i < notes.length; i++) {
            System.out.println("La nota mitjana del alumne " + (i+1) + " es " + mitja[i] + "\nLa nota minima del alumne " + (i+1) + " es " + maxtot[i] + "\nLa nota maxima del alumne " + (i+1) + " es " + maxtot[i]);
            
        }
    }
    
}
