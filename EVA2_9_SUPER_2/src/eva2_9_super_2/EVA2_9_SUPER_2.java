/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author yisus
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante("Jesus Ivan", "Calderon Rodriguez", 18, "22550315");
        estudiante.imprimirDatos();
        
        Proveedores proveedor = new Proveedores("Erik Daniel", "Avila Avila", 18, "JIVM010704");
        proveedor.imprimirDatos();
        
        Docentes docente = new Docentes("Ludim", "Rios Carrillo", 19, "jfhdshopa");
        docente.imprimirDatos();
    }
    
}
