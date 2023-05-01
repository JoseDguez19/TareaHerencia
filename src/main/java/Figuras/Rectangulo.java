/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author ap550
 */
public class Rectangulo extends Paralelogramo{
    
    private int baseRec, alturaRec;

    @Override
    public int getBase() {
        return baseRec;
    }

    @Override
    public void setBase(int base) {
        this.baseRec = 20;
    }

    @Override
    public int getAltura() {
        return alturaRec;
    }

    @Override
    public void setAltura(int altura) {
        this.alturaRec = 14;
    }

    public Rectangulo(int baseRec, int alturaRec, int base, int altura, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(base, altura, x1, y1, x2, y2, x3, y3, x4, y4);
        this.baseRec = 20;
        this.alturaRec = 14;
    }

    public void verDatos(){
        int area= 20*14;
                System.out.println("Rectangulo: "+area);
    }
}
