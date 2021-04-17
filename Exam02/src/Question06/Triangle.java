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
public class Triangle extends GeometricObject {

    public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
        super(side1, side2, side3, color, filled);
    }

    @Override
    public double calcArea() {
        double s;
        s=(super.getSide1()+super.getSide2()+super.getSide3())/2.0;
        double a=s-super.getSide1();
        double b=s-super.getSide2();
        double c=s-super.getSide3();
        
        double result = Math.sqrt(s*a*b*c);
        return Math.round(result*100)/100.0;
        
    }

    @Override
    public double calcperimeter() {
        return super.getSide1()+super.getSide2()+super.getSide3();
    }

    @Override
    public String toString() {
        return "Area of triangle = "+calcArea()+
                "\nPerimeter of triangle = "+calcperimeter()+
                "\nColor = "+super.getColor()+
                "\nIsfilled = "+super.getFilled();
                
                }
    
    
}
