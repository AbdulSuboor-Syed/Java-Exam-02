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
public  class Rectangle extends GeometricObject  {

    public Rectangle(double length, double Width) {
        super(length, Width);
    }

    @Override
    public double calcArea() {
       return super.getLength()*super.getWidth();
    }

    @Override
    public double calcPerimeter() {
        return 2*(super.getLength()+super.getWidth());
    }

    @Override
    public String toString() {
        return "Length: "+super.getLength()
               +"\nWidth: "+super.getWidth()
                +"\nArea: "+calcArea()
                +"\nPerimeter"+calcPerimeter();
    }
    
    
    
}
