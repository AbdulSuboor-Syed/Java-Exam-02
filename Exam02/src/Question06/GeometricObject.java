/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

/**
 *
 * @author Syed Abdul Suboor
 */
public abstract class GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    private String color;
    private Boolean filled;

    public GeometricObject(double side1, double side2, double side3, String color, Boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.filled = filled;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    
    public abstract double calcArea();
    public abstract double calcperimeter();
    
}
