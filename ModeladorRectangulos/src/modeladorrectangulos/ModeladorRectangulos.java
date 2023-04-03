/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeladorrectangulos;
import java.util.Scanner;
import Entity.Rectangulos;
/**
 *
 * @author Diego
 */
public class ModeladorRectangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Rectangulos rec = new Rectangulos();
        System.out.println("Ingrese la altura del rectangulo: ");
        rec.setAltura(sc.nextInt());
        System.out.println("Ingrese la base del rectangulo: ");
        rec.setBase(sc.nextInt());
        
        System.out.println("Perimetro: " + rec.calcularPerimetro());
        System.out.println("Superficie: " + rec.calcularSuperficie());
        System.out.println("");
        rec.dibujerRectangulo();
    }
    
}
