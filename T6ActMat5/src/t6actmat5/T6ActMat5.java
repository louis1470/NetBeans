/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actmat5;

import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActMat5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Cuantas personas quiere comparar?: ");
        n = entrada.nextInt();
        double sous[][] = new double[n][2], sumah = 0, sumad = 0, h = 0, d = 0;
        for (int i = 0; i < sous.length; i++) {
            for (int j = 0; j < sous[i].length; j++) {
                System.out.print("Dime si eres hombre o mujer. Para hombre pulse 1 y para mujer pulse 2: ");
                sous[i][j] = entrada.nextDouble();
                while (sous[i][j] != 1 && sous[i][j] != 2) {
                    System.out.print("Error con el dato introducido, porfavor pulse 1 para hombre o 2 para mujer: ");
                    sous[i][j] = entrada.nextDouble();
                }
                j++;
                System.out.print("Introduce el salario: ");
                sous[i][j] = entrada.nextDouble();
                if (sous[i][j-1] == 1) {
                    sumah += sous[i][j];
                    h++;
                } else{
                    sumad += sous[i][j];
                    d++;
                }
            }
        }
        System.out.printf("\nLa mitja dels homens es: %.2f \n",(sumah/h));
        System.out.printf("La mitja de les dones es: %.2f \n",(sumad/d));
    }
    
}
