/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadromagico;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class CuadroMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] m = new int [3][3];
        
        llenarMatriz(m);
        imprimirMatriz(m);
        System.out.println(esMagica(m));
    }
    
    public static void llenarMatriz(int [][] m){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                do{
                   System.out.println("Ingrese valor fila[" + (i + 1) + "] columna [" + (j+1) +"]: ");
                   m[i][j]= sc.nextInt();
                   if (m[i][j] < 0 || m[i][j] > 9){
                       System.out.println("Error ingrese un valor entre 1 y 9");
                   }
                }while(m[i][j] < 0 || m[i][j] > 9 );
            }
            
        }
    }
    
    public static void imprimirMatriz(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print( m[i][j] + " ");
            } 
            System.out.println("");
        }
    }
    
    public static boolean esMagica(int [][] m){
        if (m[0][0] + m [0][1] + m [0][2] != 15) return false;
        if (m[0][0] + m [1][1] + m [2][2] != 15) return false;
        if (m[0][0] + m [1][0] + m [2][0] != 15) return false;           
        return true;
    }
    
}
