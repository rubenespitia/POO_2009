/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.forzamiento;

/**
 *
 * @author ruben
 */
public class Forzamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Upcast
        Padre p = new Hijo();
        p.nombrep = "Jonathan";
        //Imprime el metodo
        System.out.println(p.nombrep);
        //Esto será ejecutado
        p.Metodo();
        
        Padre pp = new Padre();
        //Downcast
         // Downcasting Exlicito
        Hijo h = (Hijo)p;
 
        h.nombreh = "Ruben";
        System.out.println(h.nombrep);
        System.out.println(h.nombreh);
        h.Metodo();
        
    }
    
}
