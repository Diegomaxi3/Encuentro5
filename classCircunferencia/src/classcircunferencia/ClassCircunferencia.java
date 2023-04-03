/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcircunferencia;
import java.util.Scanner;
import Entity.Circunferencia;
/**
 *
 * @author Diego
 */
public class ClassCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el radio de la circunferencia: ");
        Scanner sc = new Scanner(System.in);
        Circunferencia cir = new Circunferencia(sc.nextFloat());
        System.out.println("");
        System.out.print("Radio: ");System.out.println(cir.getRadio());
        System.out.print("Perimetro: ");System.out.println(cir.perimetro());
        System.out.print("Area: ");System.out.println(cir.area());
        cir.crearCircunferencia(15);
        System.out.println("");
        System.out.print("Radio: ");System.out.println(cir.getRadio());
        System.out.print("Perimetro: ");System.out.println(cir.perimetro());
        System.out.print("Area: ");System.out.println(cir.area());
        
    }
    
}
