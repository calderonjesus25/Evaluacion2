/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author yisus
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        
        estu.setNombre("Jesus");
        estu.setApellido("Calderon");
        estu.setEdad(18);
        estu.setNoControl("22550315");
        
        System.out.println("IMPRIMIR DATOS ESTUDIANTE:");
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellido: " + estu.getApellido());
        System.out.println("Edad: " + estu.getEdad());
        System.out.println("Numero de control: " + estu.getNoControl());
        //-------
        Proveedores prove = new Proveedores();
        
        prove.setNombre("Daniel");
        prove.setApellido("Avila");
        prove.setEdad(18);
        prove.setRfc("JIVM40904");
        
        System.out.println("IMPRIMIR DATOS PROVEEDOR:");
        System.out.println("Nombre: " + prove.getNombre());
        System.out.println("Apellido: " + prove.getApellido());
        System.out.println("Edad: " + prove.getEdad());
        System.out.println("RFC: " + prove.getRfc());
    }
    
}
