/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;
import Entity.Puntos1;
/**
 *
 * @author Diego
 */
public class Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos1 puntos = new Puntos1();
        puntos.crearPuntos();
        System.out.println("Distancia: " + puntos.calcularDistancia());
    }
    
}
