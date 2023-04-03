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
public class Circunferencia {
    private float radio;
    
    public Circunferencia(float radio){
        this.radio = radio;
    }
    
    private void setRadio(float radio){
        this.radio = radio;
    }
    
    public float getRadio(){
        return radio;
    }
    
    public void crearCircunferencia(float radio){
        setRadio(radio);
    }
    
    public float area(){
        return (float)(Math.pow((Math.PI * radio),2));
    }
    
    public float perimetro(){
        return (float)(2*Math.PI*radio);
    }
}
