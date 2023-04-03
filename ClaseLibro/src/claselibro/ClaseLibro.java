/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claselibro;
import java.util.Scanner;
import Entity.Libro;
/**
 *
 * @author Diego
 */
public class ClaseLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro = cargar();
        imprimit(libro);
    }
    
    public static Libro cargar(){
        
        Scanner sc = new Scanner(System.in);
        String isbn, titulo, autor;
        int pag;
      
        System.out.println("Ingrese el ISBN del libro: ");
        isbn = sc.nextLine();
        System.out.println("Ingrese El titulo del libro: ");
        titulo = sc.nextLine();
        System.out.println("Ingrese el autor: ");
        autor = sc.nextLine();
        System.out.println("Ingrese la cantidad de paginas: ");
        pag = sc.nextInt();
        return  new Libro(isbn,autor,titulo,pag);
    }
    
    public static void imprimit(Libro libro){
        System.out.println("<----- Descipcion libro Libro ----->");
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Cantidad de Paginas: " + libro.getNumeroPaginas());
    }
    
}
