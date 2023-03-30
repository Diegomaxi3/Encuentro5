/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletras;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String [] palabras = new String [5];
        for (int i = 0; i < 5; i++) {
           do{
                 System.out.print("Ingrese la palabra nro " + (i + 1) + " : ");
                 palabras[i] = sc.nextLine();
                 if (palabras[i].length() < 3 || palabras[i].length() > 5) 
                     System.out.println("Debe ingresar una de al menos 3 caracteres y maximo de 5");
           }while(palabras[i].length() < 3 || palabras[i].length() > 5);
        }
        String [][] sopa = new String[20][20];
        armar(sopa,palabras);
        rellenar(sopa);
        imprimir(sopa,palabras);
    }
    
    static public void armar(String [][] sopa, String [] palabras){
        for (int i = 0; i < palabras.length; i++) {
            int fila = (int)(1+ Math.random() * (19 - palabras[i].length()) ); 
            int columna = (int)(Math.random() * 20); 
            for (int j = 0; j < palabras[i].length(); j++) {
                if(j < palabras[i].length())
                  sopa[fila][columna] = palabras[i].substring(j,j+1).toUpperCase();
                fila++;
            }
        }
    }
    
    static public void imprimir(String [][] sopa, String [] palabras){
        System.out.println("Palabras a busca: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print((i + 1) + " - " + palabras[i].toUpperCase());
            if (i < palabras.length - 1) System.out.print(" <--> ");
        }
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    static public void rellenar(String [][] sopa){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(sopa[i][j] == null){
                   sopa[i][j] = letrasRand(); 
                }
            }
        }
    }
    
    static public String letrasRand(){
        String letra = "A";
        switch((int)(Math.random() * 25 + 1)){
            case 1: return "A";
            case 2: return "B";
            case 3: return "C";
            case 4: return "D";
            case 5: return "E";
            case 6: return "F";
            case 7: return "G";
            case 8: return "H";
            case 9: return "I";
            case 10: return "J";
            case 11: return "K";
            case 12: return "L";
            case 13: return "M";
            case 14: return "N";
            case 15: return "O";
            case 16: return "P";
            case 17: return "Q";
            case 18: return "R";
            case 19: return "S";
            case 20: return "T";
            case 21: return "U";
            case 22: return "V";
            case 23: return "W";
            case 24: return "X";
            case 25: return "Y";
            case 26: return "Z";
        }
        return letra;
    }
    
}
