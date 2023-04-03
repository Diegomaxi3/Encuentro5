/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Operacion1 {
    private int numero1,numero2;

    public Operacion1(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
     public Operacion1() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

   public void crearOperacion(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el primer numero: ");
       setNumero1(sc.nextInt());
       System.out.println("");
       System.out.print("Ingrese el segundo numero: ");
       setNumero2(sc.nextInt());
   }  
   
   public int sumar(){
       return numero1 + numero2;
   }
   
   public int restar(){
       return numero1 - numero2;
   }
   
   public int multiplicar(){
       return numero1 * numero2;
   }
   
   public float dividir(){
       if(numero2 > 0){
          return  (float) numero1 / numero2;
       }
       else 
       {
           System.out.println("Error: no se puede dividir por 0");
         return 0;
       }
   }
}
