/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriznxmaletorios;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class MatrizNxMAletorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la candidad de filas a agregar: ");
        int filas = sc.nextInt();
        System.out.println("Ingresa la cantidad de columnas: ");
        int columnas = sc.nextInt();
        int [][] m = new int[filas][columnas];
        llenar(m);
        imprimir(m);
    }
    
    public static void llenar(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() *9);
            }
        }
    }
    
    public static void imprimir(int [][] m){
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
                suma += m[i][j];
            }
            System.out.println("");           
        }
        System.out.println("La suma de sus elementos es de: " + suma);
    }    
}
