/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenarvectorproparametro;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class LLenarVectorProParametro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del vector: ");
        int tamanio = sc.nextInt();
        int [] v = new int[tamanio];
        llenarVector(v);
        imprimirVector(v);
        // TODO code application logic here
    }
    
    public static void llenarVector(int [] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 10 + 1);
        }
    }
    
    public static void imprimirVector(int [] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
}
