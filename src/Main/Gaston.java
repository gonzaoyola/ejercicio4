/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author gasto
 */
public class Gaston {
    
    private String nombre;
    private int edad;

    public Gaston(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Gaston() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
