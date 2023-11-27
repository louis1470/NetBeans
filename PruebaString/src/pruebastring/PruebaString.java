/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebastring;

/**
 *
 * @author dam_payne_louis
 */
public class PruebaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "prova de text";
        String s2 = "Prova de Text";
        System.out.println("Comparamos si son iguales: ");
        System.out.println(s1.equals(s2));
        System.out.println("Sin tener en cuenta las mayusculas:");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("Comparamos por ordren alfabetico:");
        System.out.println(s1.compareTo(s2));
        System.out.println("Comparamos por orden alfabetico sin tener en cuenta las mayusculas:");
        System.out.println(s1.compareToIgnoreCase(s2));
    }
    
}
