/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author ap550
 */
public class Persona {
    
    private  String nombre;
    private  String domicilio;
    private  String curp;
    private  int edad;
    private  int telefono;    

    
    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCurp() {
        return curp;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public Persona(String nombre, String domicilio, String curp, int edad, int telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.curp = curp;
        this.edad = edad;
        this.telefono = telefono;
    }

        
}

    

