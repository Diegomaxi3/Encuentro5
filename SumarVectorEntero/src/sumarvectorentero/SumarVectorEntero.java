/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarvectorentero;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class SumarVectorEntero {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamanio del vector: ");
        int tamanio = sc.nextInt();
        int [] v = new int[tamanio];
        llenarVector(v);
        impirmirVector(v);
        
    }
    
    public static void llenarVector(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] =(int) (1 + Math.random() * 10); 
        }
    }
    public static void impirmirVector(int[] v){
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i != v.length - 1)System.out.print(" + ");
            suma += v[i];
        }
        System.out.println(" = " + suma);
    }
    
}
