/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author ap550
 */
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        
        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        
        Paralelogramo paralelogramo = new Paralelogramo(8, 6);
        System.out.println("Área del paralelogramo: " + paralelogramo.calcularArea());
        
        Trapezoide trapecio = new Trapezoide(8, 5, 4);
        System.out.println("Área del trapecio: " + trapecio.calcularArea());
    }
}
