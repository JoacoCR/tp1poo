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
public class Celular {

    private int durabilidad;
    private String nombre;
    private int tamaño;

    public Celular(int durabilidad, String nombre, int tamaño) {
        this.durabilidad = durabilidad;
        this.tamaño = tamaño;
        this.nombre = nombre;

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

    public void saludar() {
        System.out.println(this.nombre);
        System.out.println(this.tamaño);
        System.out.println(this.durabilidad);
    }
    public void suma() {
    int i = 0;
    while (i<10) {
    System.out.println("samsung es mejor que iphone ");
        i++;
    }
}
}
