/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Puntos1 {
    private double x1,x2,y1,y2;
    
    public Puntos1(){};
    public void crearPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los primeros dos puntos (x,y):  ");
        x1 = sc.nextInt();y1 = sc.nextInt();
        System.out.println("Ingrese los segundos dos puntos (x,y):  ");
        x2 = sc.nextInt();y2 = sc.nextInt();
    }
    
    public double calcularDistancia(){
        double x = Math.pow((x2 - x1),2 );
        double y = Math.pow((y2 - y1 ),2);
        
        return Math.sqrt(x + y);
    }
    
}
