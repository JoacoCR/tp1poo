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
public class app {
    private int tiempo;
    private String nombre; 
    
    public app(int tiempo, String nombre) {
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void saludar() {
        System.out.println(this.tiempo); 
}
}
    
