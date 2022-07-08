/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.clasesabstractas;

/**
 *
 * @author ruben
 */
public class Cuadrado extends CFigura{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuadrado objeto = new Cuadrado();
        objeto.hola();
        objeto.setNumero(3);
        System.out.println(objeto.getNumero());
        objeto.area(objeto.getNumero());
    }

    @Override
    void hola() {
        System.out.println("Hola, esta es una funcion definida abstractamente");
    }

    @Override
    void area(int numero) {
      double r=numero*numero;  
      System.out.println(r);
    }
    
}
