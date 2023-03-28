/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativoegg;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class AplicativoEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double [][] alumnos = new double [10][4];
        int op = 0;
        do{
            System.out.println("Menu");
            System.out.println("1 - Ingresar Notas: ");
            System.out.println("2 - Ver notas: ");
            System.out.println("3 - Ver promedios: ");
            System.out.println("4 - ver Aprobados: ");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            
            switch (op){
                case 1: llenarNotas(alumnos); break;
                case 2: imprimirNotas(alumnos); break;
                case 3: System.out.println(verPromedios(alumnos)); break;
                case 4: verAprovados(alumnos); break;
                case 5: break;
                default: System.out.println("Ingrese una opcion correcta: ");
            }
        }while(op != 5);
    }
    
    public static void llenarNotas(double [][] alumnos){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + i + " :");
            for (int j = 0; j < 4; j++) {
                do{
                switch(j){
                    case 0: {                        
                        System.out.print("  Ingrese nota practico evaluativo 1: ");
                        alumnos[i][j] = sc.nextDouble();
                        break;
                    }
                    case 1: {                       
                        System.out.print("  Ingrese nota practico evaluativo 2: ");
                        alumnos[i][j] = sc.nextDouble();
                        break;
                    }
                    case 2: {                       
                        System.out.print("  Ingrese nota integrador 1: ");
                        alumnos[i][j] = sc.nextDouble();
                        break;
                    }
                    case 3: {                      
                        System.out.print("  Ingrese nota integrador 2: ");
                        alumnos[i][j] = sc.nextDouble();
                        break;
                    }
                   
                }
                 System.out.println("");
                if (alumnos[i][j] < 0 || alumnos[i][j]>10){
                    System.out.println("Ingrese una nota dentro del rango permitodo  1 - 10");
                }
                
                }while(alumnos[i][j] < 0 || alumnos[i][j]>10);
                
                
            }
        }
    }
    
    
}
