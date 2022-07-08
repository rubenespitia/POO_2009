/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_5.herenciamultiple;

/**
 *
 * @author ruben
 */
public class HerenciaMultiple implements Interfaz1, Interfaz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HerenciaMultiple A = new HerenciaMultiple();
        A.I1_metodo1();
        A.I1_metodo2();
        A.I1_metodo3();
        
        A.I2_metodo1();
        A.I2_metodo2();
        A.I2_metodo3();
    }
    


    @Override
    public void I1_metodo1() {
        System.out.println("Interfaz 1 Metodo 1");
    }

    @Override
    public void I1_metodo2() {
        System.out.println("Interfaz 1 Metodo 2");
    }

    @Override
    public void I1_metodo3() {
        System.out.println("Interfaz 1 Metodo 3");
    }

    @Override
    public void I2_metodo1() {
         System.out.println("Interfaz 2 Metodo 1");
    }

    @Override
    public void I2_metodo2() {
                 System.out.println("Interfaz 2 Metodo 2");
    }

    @Override
    public void I2_metodo3() {
                 System.out.println("Interfaz 2 Metodo 3");
    }
    
}
