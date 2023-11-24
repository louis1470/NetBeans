/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6act11;

/**
 *
 * @author dam_payne_louis
 */
public class T6Act11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array1[] = new int[100];
        int array2[] = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.println(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[array1.length - i - 1];
            System.out.println(array2[i]);
        }
    }

}
