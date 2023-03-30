/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor para armar la tabla Fibonacci: ");
        int num = sc.nextInt();
        armarTabla(num);
    }
    
    public static void armarTabla(int n){
        if(n > 0){
            int num = (n) + (n - 1);
            n--;
            armarTabla(n);     
            System.out.print(num + ",");
        }
    }
    
}
