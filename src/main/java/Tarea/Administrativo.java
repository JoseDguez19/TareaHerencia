/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author ap550
 */
public class Administrativo extends Persona{
    
    private String matricula;
    private String puesto;
    private String horario;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Administrativo(String nombre, String domicilio, String curp, int edad, int telefono,String matricula, String puesto, String horario) {
        
        super(nombre, domicilio, curp, edad, telefono);
        this.matricula = matricula;
        this.puesto = puesto;
        this.horario = horario;
    }
    
    public void verDatos(){
    
        System.out.println("\n-MOSTRAR DATOS DEL ADMINISTRATIVO-");
        
        System.out.println("Nombre: "+getNombre()+
                "\nDomicilio: "+getDomicilio()+
                "\nCURP: "+getCurp()+
                "\nEdad: "+getEdad()+
                "\nTelefono: "+getTelefono()+
                "\nMatricula: "+getMatricula()+
                "\nPuesto: "+getPuesto()+
                "\nHorario: "+getHorario());
    }

}
