/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testfunciones;

/**
 *
 * @author dam_payne_louis
 */
public class TestFunciones {

    /**
     * @param args the command line arguments
     */
    public static void imprimeHolaMundo() {
        System.out.println("Hola Mundo");
    }
    
    public static int doble (int a) {
        int resultado = a * 2;
        return resultado;
    
    }
    
    public static int multiplica(int a, int b){
        int resultado = a * b;
        return resultado;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        imprimeHolaMundo();
        int a = doble(10);
        int b = multiplica(3,5);
        System.out.println(a + " " + b);
    }
    
}
