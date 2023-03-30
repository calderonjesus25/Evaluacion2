/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_uso_interfaces;

/**
 *
 * @author yisus
 */
public class Circulo implements Figuras, MostrarDatos{
    private double radio;
    
    public Circulo(){
        this.radio = 0;
}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//La interfas 
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
        
    }

    @Override
    public double calcularPeri() {
        return Math.PI * (radio * 2);
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Radio:" + radio);
        System.out.println("Area:" + calcularArea());
        System.out.println("perimetro:" + calcularPeri());
    }
}
