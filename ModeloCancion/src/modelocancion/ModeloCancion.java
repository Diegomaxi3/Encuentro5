/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelocancion;
import java.util.Scanner;
import Entity.Cancion;
/**
 *
 * @author Diego
 */
public class ModeloCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion cancion1 = ingresarCancion();
        System.out.println("El titulo ingresado es: " + cancion1.getTitulo());
        System.out.println("El autor ingresado es: " + cancion1.getAutor());
    }
    
    public static Cancion ingresarCancion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese El titulo de la cancion: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese El Autor de la cancion: ");
        String autor = sc.nextLine();
        Cancion cancion= new Cancion(titulo,autor);
        return cancion;
    }
    
}
