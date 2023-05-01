package Figuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ap550
 */
public class Paralelogramo extends Cuadrilatero{
    
    private int basePar, alturaPar;

    public int getBase() {
        return basePar;
    }

    public void setBase(int base) {
        this.basePar = 12;
    }

    public int getAltura() {
        return alturaPar;
    }

    public void setAltura(int altura) {
        this.alturaPar = 19;
    }

    public Paralelogramo(int basePar, int alturaPar, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
       super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.basePar = 12;
        this.alturaPar = 19;
    }

    public void verDatos(){
    
        int Area = 12*19;
        System.out.println("Paralelogramo: "+Area);
    }

}
