/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08Example1;

/**
 *
 * @author Syed Abdul Suboor
 */
public abstract class GeometricObject {
    private double side1;
    private double side2;

    public GeometricObject(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    
    public abstract double calcArea();
    public abstract double calcPerimeter();
}
