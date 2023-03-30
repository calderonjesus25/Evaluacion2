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
public class EVA2_18_USO_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Figuras figu = Figuras (); no se puede
        //MostrarDatos mostrar = new MostrarDatos no se puede
        Circulo circu = new Circulo();
        circu.setRadio(50);
        circu.imprimirDatos();
        
        Triangulo triangulo = new Triangulo(20, 20);
        triangulo.imprimirDatos();
    }
    
}
