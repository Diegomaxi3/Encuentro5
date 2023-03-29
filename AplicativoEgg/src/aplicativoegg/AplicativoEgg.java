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
            System.out.println("3 - Llenar de forma aleatoria: ");
            System.out.println("4 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            
            switch (op){
                case 1: llenarNotas(alumnos); break;
                case 2: imprimirNotas(alumnos); break;
                case 3: llenarAleatorio(alumnos);System.out.println("LLenado automatico completado"); break;
                case 4: break;
                default: System.out.println("Ingrese una opcion correcta: ");
            }
            if (op != 4){
                System.out.println("presione una teclapra contunuar.. ");
                sc.nextLine();
                sc.nextLine();
            }
        }while(op != 4);
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
    
    public static void imprimirNotas(double [][] alumnos){
        double promedio = 0;
        System.out.print(formato(" "));
        System.out.print("  Evaluativo 1");
        System.out.print("  Evaluativo 2");
        System.out.print("  Integrador 1");
        System.out.print("  Integrador 2");
        System.out.print("      Promedio");
        System.out.print("      Aprobado");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(formato("Alumno " + (i + 1)));
            promedio = 0;
            for (int j = 0; j < 4; j++) {                              
                 System.out.print(formato(String.valueOf(alumnos[i][j])));
                 switch(j){
                     case 0: promedio += alumnos[i][j] * 0.1;break;
                     case 1: promedio += alumnos[i][j] * 0.15;break;
                     case 2: promedio += alumnos[i][j] * 0.25;break;
                     case 3: promedio += alumnos[i][j] * 0.5;break;
                 }
            }
            System.out.print(formato(String.valueOf(Math.round(promedio))));
            boolean aprobado = promedio >= 7;
           
            System.out.print(aprobado ? formato("si") : formato("no"));
            System.out.println("");
        }
    }
    
    private static String formato(String dato){
        while(14 - dato.length() > 0){
            dato = " " + dato;
        }
        return dato;
    }

    public static void llenarAleatorio(double [][] alumnos)  {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                alumnos[i][j] = Math.round(Math.random() * 10);
            }
        }
    
    }  
    
}
