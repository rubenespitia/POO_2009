
package pkg1.principiodeclases;

/**
 *
 * @author ruben
 */
public class ClasePersona {
    private String nombre;
    private int edad;

    public ClasePersona() {
        this.nombre="Sin nombre";
        this.edad=0;
    }
    
     public ClasePersona(String a, int b) {
        this.nombre=a;
        this.edad=b;
    }
    public void Saludo() {
        System.out.println("Hola");
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
