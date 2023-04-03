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
public class Rectangulos {
    private int base;
    private int altura;
    
    public void Rectangulo(){};

    public void Rectangulos(int b, int a){
        base = b;
        altura = a;
    }
    
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calcularPerimetro(){
        return altura * 2 +  base * 2;
    }
    
    public int calcularSuperficie(){
        return (altura * base) * 2;
    }
    
    public void dibujerRectangulo(){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if(j == 0 || j == altura - 1){
                    System.out.print("* ");
                }else{
                    if(i == 0 || i == base - 1)System.out.print("* ");
                            else System.out.print("  ");   
                }    
            } 
            System.out.println("");
        }
    }
}
