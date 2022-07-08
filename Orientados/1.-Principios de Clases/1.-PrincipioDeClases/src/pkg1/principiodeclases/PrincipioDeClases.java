
package pkg1.principiodeclases;

/**
 *
 * @author ruben
 */
public class PrincipioDeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasePersona Juan = new ClasePersona();
        System.out.println("El nombre asignado de Juan: " + Juan.getNombre());
        System.out.println("La edad asignada de Juan: " + Juan.getEdad());
        
        ClasePersona Pedro = new ClasePersona("Pedro", 21);
        System.out.println("El nombre asignado de Pedro: " + Pedro.getNombre());
        System.out.println("La edad asignada de Pedro: " + Pedro.getEdad());
        Pedro.Saludo();
        
        ClaseAlumno Trabajador1 = new ClaseAlumno("Trabajadorcin", 21,"21Tra");
        System.out.println("El nombre asignado de Trabajador 1: " + Trabajador1.getNombre());
        System.out.println("La edad asignada de Trabajador 1: " + Trabajador1.getEdad());
        System.out.println("La edad asignada de Trabajador 1: " + Trabajador1.getClave());
        Trabajador1.Saludo();
    }
    
}
