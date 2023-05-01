/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author ap550
 */
public class Trapezoide extends Cuadrilatero{
    
    private int baseMayor, baseMenor, altura;

    public int getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Trapezoide(int baseMayor, int baseMenor, int altura, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.baseMayor = 9;
        this.baseMenor = 5;
        this.altura = 12;
    }
    
   
    public void verDatos(){
        
    double Area = 0.5*(9+5)*12;
    
    System.out.println("Trapezoide: "+Area);
    }

}
