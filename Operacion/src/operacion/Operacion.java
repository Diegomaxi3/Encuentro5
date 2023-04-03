/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;
import Entity.Operacion1;
/**
 *
 * @author Diego
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion1 op = new Operacion1();
        op.crearOperacion();
        System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicacion: " + op.multiplicar());
        System.out.println("Division: " + op.dividir());
    }
    
}
