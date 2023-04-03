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
    
    public Circunferencia(){};
    public Circunferencia (float radio){this.radio = radio;}
    
    public float getRadio(){
        return radio;
    }
    
    private void setRadio(float radio){
        this.radio = radio;
    }
    
    public void crearCircunferencia(float radio){
        setRadio(radio);
    }
    
    public float area(){
        float a = (float) (Math.PI*radio);
        float resultado =(float) Math.pow(a , 2);
        return resultado;
    }
    
    public float perimetro(){
        return (float) (2*Math.PI*radio);
    }
}
