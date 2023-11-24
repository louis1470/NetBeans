/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplewhile2;

/**
 *
 * @author dam_payne_louis
 */
public class ExempleWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pares = 0, impares = 0;
        int cont = 100;
        while (cont <= 200) {
            if (cont % 2 == 0) {
                pares = pares + cont;
            } else {
                impares = impares + cont;
            }
            cont++;
        }
        System.out.println("la suma de los pares es: " + pares + ". Y la suma de los impares es: " + impares);
    }

}
