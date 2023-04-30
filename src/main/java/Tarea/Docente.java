/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author ap550
 */
public class Docente extends Persona{
    
    private String matricula;
    private String academia;
    private String horario;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Docente(String nombre, String domicilio, String curp, int edad, int telefono,String matricula, String academia, String horario) {
        super(nombre, domicilio, curp, edad, telefono);
        this.matricula = matricula;
        this.academia = academia;
        this.horario = horario;
    }
    
    public void verDatos(){
    
        System.out.println("\n-MOSTRAR DATOS DEL DOCENTE-");
        
        System.out.println("Nombre: "+getNombre()+
                "\nDomicilio: "+getDomicilio()+
                "\nCURP: "+getCurp()+
                "\nEdad: "+getEdad()+
                "\nTelefono: "+getTelefono()+
                "\nMatricula: "+getMatricula()+
                "\nAcademia: "+getAcademia()+
                "\nHorario: "+getHorario());
    }
    
    
}
