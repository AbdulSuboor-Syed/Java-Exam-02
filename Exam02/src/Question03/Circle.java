/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double diameter(){
        return 2*radius;
    }
    public double circumference(){
        return 2*radius*Math.PI;
    }
    public double areaOfCircle(){
        return Math.PI*Math.sqrt(radius);
    }

    @Override
    public String toString() {
        return "Radius= " + radius 
               +"\tDiameter of a circle= "+diameter()+
               "\tCircumference of a circle= "+circumference()+
               "\tArea of the circle= "+areaOfCircle();
    }
    
    
}
