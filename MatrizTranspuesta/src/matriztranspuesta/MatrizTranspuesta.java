/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriztranspuesta;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] m = new int[4][4];
        llenarMatriz(m);
        imprimirMatriz(m);
        System.out.println("");
        imprimirTranspuesta(m);
    }
    
    public static void llenarMatriz(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(1 + Math.random() * 10);
            }        
        }
    }
    
    public static void imprimirMatriz(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
        public static void imprimirTranspuesta(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
}
