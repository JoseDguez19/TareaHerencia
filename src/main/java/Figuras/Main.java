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
        Cuadrado c1 = new Cuadrado(5, 10, 15, 12, 19, 5, 9, 4, 7, 6, 8, 3, 2);
        c1.verDatos();
        
        Rectangulo rec1 = new Rectangulo(10, 15, 12, 19, 5, 9, 4, 7, 6, 8, 3, 2);
        rec1.verDatos();
        
        Paralelogramo paralelogramo = new Paralelogramo(12, 19, 5, 9, 4, 7, 6, 8, 3, 2);
        paralelogramo.verDatos();
        
        Trapezoide trap1 = new Trapezoide(9, 5, 12, 5, 9, 4, 7, 6, 8, 3, 2);
        trap1.verDatos();
    }
    
}
