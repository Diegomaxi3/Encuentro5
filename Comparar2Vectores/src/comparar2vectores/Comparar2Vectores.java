/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparar2vectores;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Comparar2Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamanio del vector: ");
        int tamanio = sc.nextInt();
        int [] v1 = new int[tamanio];
        int [] v2 = new int[tamanio];
        llenarVectores(v1,v2);
        imprimirVectores(v1,v2);
        System.out.println("Son iguales? " + sonIguales(v1,v2));
    }
    
    public static void llenarVectores(int [] v1, int [] v2){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            v1[i] = sc.nextInt();           
       }
                
        for (int i = 0; i < v2.length; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            v2[i] = sc.nextInt();        
        }
    }
    
    public static void imprimirVectores(int [] v1, int [] v2){
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");    
        }
        
        System.out.println("");
        
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");    
        }
        System.out.println("");
    }
    
    public static boolean sonIguales(int [] v1, int [] v2){
        for (int i = 0; i < v1.length; i++) {
            if(v1[i] != v2[i])  return false;
        }
        return true;
    }
    
}
