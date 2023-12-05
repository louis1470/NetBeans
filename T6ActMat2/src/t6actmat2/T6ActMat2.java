/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6actmat2;

import java.util.Arrays;

/**
 *
 * @author dam_payne_louis
 */
public class T6ActMat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[][] = new int[10][10];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (i + 1)*(j + 1);
            }
            System.out.println(Arrays.toString(num[i]));
        }
    }
    
}
