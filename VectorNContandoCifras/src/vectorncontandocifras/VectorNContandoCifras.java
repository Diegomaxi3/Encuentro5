/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorncontandocifras;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class VectorNContandoCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tamanio = ingresarDatos();
        int [] v = new int[tamanio];
        llenarVector(tamanio,v);
        mostrarDigitos(v);
    }
    
    public static int ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del Vector: ");
        int cant = sc.nextInt();
        return cant;        
    }
    
    public static void mostrarDigitos(int []v){
        int cont, valor = 0;
        for (int c = 0; c < v.length;c++){
            cont = 1;
            valor = v[c];
            while (valor / 10 > 0){
                valor = valor / 10;
                cont++;
            }
            System.out.println("La pos: " + c + " tiene " + cont + " Digitos." );
        }
    }
    
    public static void llenarVector(int tamanio, int [] v){
        Scanner sc = new Scanner(System.in);
        sc.reset();
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el valor de la pos " + i + ": ");
            v[i] = sc.nextInt();
        }
    }
    
}
