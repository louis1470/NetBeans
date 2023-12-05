/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actmat1;

import java.util.Arrays;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActMat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[][] = new int[5][5], cont = 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = cont;
                cont++;
            }
            System.out.println(Arrays.toString(num[i]));
        }

    }

}
