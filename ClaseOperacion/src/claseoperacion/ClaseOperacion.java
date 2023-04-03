/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseoperacion;
import java.util.Scanner;
import Entity.Operacion;
/**
 *
 * @author Diego
 */
public class ClaseOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]nums = new int[2];
        Scanner sc = new Scanner(System.in);
        
        ingresar(sc,nums);
        Operacion op = new Operacion(nums[0], nums[1]);
    }
    
    public static int[] ingresar(Scanner sc,int [] nums){
        System.out.println("Ingrese primer numero: ");
        nums[0] = sc.nextInt();
        System.out.println("Ingrese segundo numero: ");
        nums[1] = sc.nextInt();
        return nums;
    }
    
}
