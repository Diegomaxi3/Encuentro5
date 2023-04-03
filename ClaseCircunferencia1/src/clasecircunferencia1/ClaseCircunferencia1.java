/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecircunferencia1;
import java.util.Scanner;
import Entity.Circunferencia;
/**
 *
 * @author Diego
 */
public class ClaseCircunferencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        Circunferencia cir = new Circunferencia(sc.nextFloat());
        System.out.println("Area: " + cir.area());
        System.out.println("Perimetro: " + cir.perimetro());
        
        
        System.out.println("");
        System.out.println("");
        cir.crearCircunferencia(15);
        System.out.println("Area: " + cir.area());
        System.out.println("Perimetro: " + cir.perimetro());
        
        
        System.out.println("");
        System.out.println("");
        
        Circunferencia cir1 = new Circunferencia();
        cir1.crearCircunferencia(12);
        System.out.println("Area: " + cir1.area());
        System.out.println("Perimetro: " + cir1.perimetro());
    }
    
}
