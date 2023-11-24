/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act15;

import java.util.Arrays;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0, m = 0, o = 10;
        for (int i = 0; i < o; i++) {
            n += i;
            n++;
        }
        int num[] = new int[n];
        for (int i = 1; i <= o; i++) {
            Arrays.fill(num, m, num.length, i);
            m += i;
        }
        System.out.println(Arrays.toString(num));
    }
}
        
       
    

