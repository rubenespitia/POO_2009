/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.clasesabstractas;

/**
 *
 * @author ruben
 */
public abstract class CFigura {
     private int numero;
    
    public CFigura(){
    this.numero=0;
    }
    
    abstract void hola();
    abstract void area(int numero);
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
