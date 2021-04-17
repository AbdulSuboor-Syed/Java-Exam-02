/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example1;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Rectangle implements Polygon{

    @Override
    public double calcArea() {
        return LENGTH*WIDTH;
    }

    @Override
    public double calcPerimeter() {
        return 2*(LENGTH+WIDTH);
    }
    
}
