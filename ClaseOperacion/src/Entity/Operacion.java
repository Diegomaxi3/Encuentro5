/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Diego
 */
public class Operacion {
    int numero1;
    int numero2;
    
    public Operacion(){};
    public Operacion(int numero1,int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    public void crearOperacion(int num1, int num2){
        setNumero1(num1);
        setNumero2(num2);
    }
    
    public int suma(){
        return numero1 + numero2;
    }
    
    public int restar(){
        return numero1-numero2;
    }
    
    public int dividir(){
        if(numero2 > 0)
          return numero1/numero2;
        else{
            System.out.println("");
            System.out.println("Error no se puede dividir por 0");
            return 0;
        }
    }
    
    public int multiplicar(){
        return numero1 * numero2;
    }
    
}
