/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act17;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = new int[30];
        int max = 10, min = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*(max - min) + min);
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        
    }
    
}
