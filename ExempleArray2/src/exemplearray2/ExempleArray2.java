/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplearray2;

/**
 *
 * @author dam_payne_louis
 */
public class ExempleArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int suma = 0, i;
        int notas[] = new int[]{5, 1, 12, 6};
        int calificaciones[] = new int[]{2, 13, 4, 5, 6};
        System.out.println("Array calificaciones sin modificar");
        for(int j = 0; j < calificaciones.length; j++ ){
            System.out.println(calificaciones[j]);
        }
        System.arraycopy(notas, 0, calificaciones, 0, notas.length);
        System.out.println("Array notas");
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
        System.out.println("Array calificaciones modificado");
        for(int j = 0; j < calificaciones.length; j++ ){
            System.out.println(calificaciones[j]);
        }
        //for( i = 0; i < notas.length; i++){
        //    suma = suma + notas[i];
            
        //}
        //System.out.println(suma/notas.length);
    }
    
}
