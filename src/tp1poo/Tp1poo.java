/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1poo;

/**
 *
 * @author Alumno
 */
public class Tp1poo {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Celular samsung = new Celular(70,"samsung",20);
        Celular xiaomi = new Celular(50,"xiaomni",19);
        samsung.saludar();
        xiaomi.saludar();
        samsung.suma();
    }
    
}
