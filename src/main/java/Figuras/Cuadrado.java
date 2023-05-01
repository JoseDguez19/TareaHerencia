/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author ap550
 */
public class Cuadrado extends Rectangulo{
    
    private int lado;

    public int getLado() {
        return lado*4;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Cuadrado(int lado, int basePar, int alturaPar, int base, int altura, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(base, altura, base, altura, x1, y1, x2, y2, x3, y3, x4, y4);
        this.lado = 5;
    }

    public void verDatos(){
        lado=lado*4;
        System.out.println("Cuadrado: "+ lado);
    }

}
