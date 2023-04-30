/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author ap550
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno("Jose Dominguez", "Manzano 27", "DOJ1908065HCOANAO",19, 123456789, 2260175, "Sistemas", "Escolarizado", 92.0f);
            a1.verDatos();
            
        Docente c1 = new Docente("Julio Perez", "Diaz Miron s/n", "PEJ42NDKAHOA", 42, 987654321, "MK56A", "POO", "De 7AM a 5PM");
            c1.verDatos();
            
        Administrativo ad1 = new Administrativo("Andres Garcia", "Rio Nilo 243", "GAA32HAKJLOAOI", 32, 369852147, "LKAS854", "RRHH","De 9AM A 4PM"); 
            ad1.verDatos();
    }
}
