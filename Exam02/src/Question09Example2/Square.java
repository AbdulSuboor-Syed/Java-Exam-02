/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example2;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Square implements Polygon {

    @Override
    public double calcArea() {
        return SIDE*SIDE;
    }

    @Override
    public double calcPerimeter() {
         return 4*SIDE;
    }
    
    
}
