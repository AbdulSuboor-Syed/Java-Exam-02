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
public class Sqaure extends GeometricObject  {

    public Sqaure(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public double calcArea() {
        return super.getSide1()*super.getSide2();
    }

    @Override
    public double calcPerimeter() {
        return 4*super.getSide1();
    }

    @Override
    public String toString() {
        return "\nSide1: "+super.getSide1()
                +"\nSide2: "+super.getSide2()
                +"\nArea: "+calcArea()+
                "\nPerimeter: "+calcPerimeter();
    }
    

   
    
}
