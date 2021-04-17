/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08Example2;

/**
 *
 * @author Syed Abdul Suboor
 */
public abstract class GeometricObject{
    private double length;
    private double Width;

    public GeometricObject(double length, double Width) {
        this.length = length;
        this.Width = Width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return Width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }
    
    public abstract double calcArea();
    public abstract double calcPerimeter();
    
}
