/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.principiodeclases;

/**
 *
 * @author ruben
 */
public class ClaseAlumno extends ClasePersona {
    private String clave;

    
    public ClaseAlumno() {
        this.clave="Sin nombre";
    }
    
    public ClaseAlumno(String a, int b, String c) {
        this.setNombre(a);
        this.setEdad(b);
        this.clave=c;
    }
    
    @Override
    public void Saludo() {
        System.out.println("Hola, Soy empleado");
    }
    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
