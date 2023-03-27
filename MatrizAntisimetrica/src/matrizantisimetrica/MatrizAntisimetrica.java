/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizantisimetrica;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class MatrizAntisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] m = new int[3][3];
        
        llenarMatriz(m);
        imprimirMatriz(m);
        System.out.println("");
        imprimirTranspuesta(m);
        System.out.println(esAntisimetrica(m));
    }
    
    public static void llenarMatriz(int [][] m){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor fila[ " + i +"] columna[" + j + "]:"  );
                m[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void imprimirMatriz(int [][] m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");             
            }
            System.out.println("");
        }
    }
    
     public static void imprimirTranspuesta(int [][] m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[j][i] + " ");             
            }
            System.out.println("");
        }
    }
     
     public static boolean esAntisimetrica(int [][] m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] != (m[j][i] * -1)){
                    return false;
                }           
            }
        }
        return true;
    }
    
}
