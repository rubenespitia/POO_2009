/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.enlaces.dinamico;

import pkg7.enlaces.Persona;
import pkg7.enlaces.Trabajador;

/**
 *
 * @author ruben
 */
public class EnlaceDinamico {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseA obj = new ClaseA();
        
    /* La referencia es de la clase Persona y el objeto es de tipo *Persona*/
       ClaseB obj2 = new ClaseB();  
       obj.dimeClase();
       obj2.dimeClase();
       }
}
