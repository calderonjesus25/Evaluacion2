/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author yisus
 */
public class Computadora extends Producto implements MostrarDatos{
    private String procesador;
    private int memoria;

    public Computadora() {
        super();
        procesador = "";
        memoria = 0;
    }

    public Computadora(String procesador, int memoria, int precio, String nombre) {
        super(precio, nombre);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria: " + memoria);
    }
}
