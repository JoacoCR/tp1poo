/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Celular {

    private int durabilidad;
    private String nombre;
    private int tamaño;
    private List<app> app;
    private Dueño Dueño;
    
    public Celular(int durabilidad, String nombre, int tamaño) {
        this.durabilidad = durabilidad;
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.app = new ArrayList<app>();
        this.Dueño = null;
   
    }

    public Celular(int durabilidad, String nombre, int tamaño, List<app> app, Dueño Dueño) {
        this.durabilidad = durabilidad;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.app = app;
        this.Dueño = Dueño;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public List<app> getApp() {
        return app;
    }

    public void setApp(List<app> app) {
        this.app = app;
    }

    public Dueño getDueño() {
        return Dueño;
    }

    public void setDueño(Dueño Dueño) {
        this.Dueño = Dueño;
    }

    public void saludar() {
        System.out.println(this.nombre);
        System.out.println(this.tamaño);
        System.out.println(this.durabilidad);
        if(!(this.Dueño == null)){
            System.out.print(this.Dueño.getNombre() + " ");
            System.out.print(this.Dueño.getApellido() + " ");
            System.out.println(this.Dueño.getEdad());
        }
        for(app applicacion : this.app){
         System.out.println("Tiene la app: " + applicacion.getNombre());
        }
    }

    public void suma() {
        int i = 0;
        while (i < 10) {
            System.out.println("samsung es mejor que iphone ");
            i++;
        }
    }
}
