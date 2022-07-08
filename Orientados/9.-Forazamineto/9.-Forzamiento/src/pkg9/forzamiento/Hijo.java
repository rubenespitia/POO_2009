/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.forzamiento;

/**
 *
 * @author ruben
 */
public class Hijo extends Padre {
        String nombreh;
    
    @Override
    void Metodo() {
         System.out.println("Metodo Hijo");
    }
    /**
     * @return the nombreh
     */
    public String getNombreh() {
        return nombreh;
    }

    /**
     * @param nombreh the nombreh to set
     */
    public void setNombreh(String nombreh) {
        this.nombreh = nombreh;
    }

}
