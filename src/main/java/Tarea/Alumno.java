/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author ap550
 */
public class Alumno extends Persona{
    
    private int noControl;
    private String especialidad;
    private String modalidad;
    private float promedio;

    public Alumno(String nombre, String domicilio, String curp, int edad, int telefono, int noControl, String especialidad, String modalidad, float promedio) {
        
        super(nombre, domicilio, curp, edad, telefono);
        this.noControl = noControl;
        this.especialidad = especialidad;
        this.modalidad = modalidad;
        this.promedio = promedio;
    }
    
    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }


    public void verDatos(){
    
        System.out.println("\n-MOSTRAR DATOS DEL ALUMNO-");
        
        System.out.println("Nombre: "+getNombre()+
                "\nDomicilio: "+getDomicilio()+
                "\nCURP: "+getCurp()+
                "\nEdad: "+getEdad()+
                "\nTelefono: "+getTelefono()+
                "\nNumero de Control: "+getNoControl()+
                "\nEspecialiadad"+getEspecialidad()+
                "\nModalidad"+getModalidad()+
                "\nPromedio: "+getPromedio());
    }
}
