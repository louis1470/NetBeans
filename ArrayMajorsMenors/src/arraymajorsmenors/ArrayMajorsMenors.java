/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymajorsmenors;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class ArrayMajorsMenors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int max = 10, min = -10, n, pos = 0, neg = 0, posneg = 0, cont = 0;
        System.out.print("Dona'm el tamany de l'array: ");
        n = entrada.nextInt();
        int array1[] = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (max - min) + min);
            if (array1[i] > 0) {
                pos++;
            } else if (array1[i] < 0) {
                neg++;
            }
        }
        if (pos != 0 || neg != 0) {

            System.out.print("Vols veure els numeros positius o negatius? per apositius introduix 1 i per negatius, 2: ");
            posneg = entrada.nextInt();
            while (posneg != 1 && posneg != 2) {
                System.out.print("Error en el valor introduït. Introduïx 1 per positius i 2 per negatius: ");
                posneg = entrada.nextInt();
            }
            switch (posneg) {
                case 1:
                    int arraypos[] = new int[pos];
                    for (int i = 0; i < array1.length; i++) {
                        if (array1[i] <= 0) {
                            cont++;
                        } else {
                            arraypos[i - cont] = array1[i];
                        }
                    }
                    System.out.println(Arrays.toString(array1));
                    Arrays.sort(arraypos);
                    System.out.println(Arrays.toString(arraypos));
                    break;
                case 2:
                    int arrayneg[] = new int[neg];
                    for (int i = 0; i < array1.length; i++) {
                        if (array1[i] >= 0) {
                            cont++;
                        } else {
                            arrayneg[i - cont] = array1[i];
                        }
                    }
                    System.out.println(Arrays.toString(array1));
                    Arrays.sort(arrayneg);
                    System.out.println(Arrays.toString(arrayneg));
                    break;

            }

        } else {
            System.out.println(Arrays.toString(array1));
            System.out.println("No s'ha trobat valors majors o menors a 0");
        }
    }

}
