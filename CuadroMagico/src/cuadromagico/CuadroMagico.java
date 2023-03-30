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
        int fila=0,columna=0,diagonal=0,inversa=0;
        
        for (int i = 0; i < 3; i++) {
            fila = m[0][i];
            columna = m[i][0];
            diagonal= m[i][i];
            inversa = m[2 - i][2 - i];  
            if (fila != columna || fila != m[0][i - 1]){
                return false;
            }
        }   
       
        if (diagonal != columna || inversa != columna )return false;
        return true;
    }
    
}
