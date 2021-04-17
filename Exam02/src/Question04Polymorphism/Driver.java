/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question04Polymorphism;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cars c=new Cars("XYZ Model","MRF", 200);
        System.out.println(c);
        System.out.println("**********************************************");
        BMWM3 b=new BMWM3("Fast","ABC Model","TYL", 350);
        System.out.println(b);
        Cars b1= new BMWM3("Fast","M3 Model","TYL",400);
        System.out.println(b1);
        System.out.println(b1.gear());
    }
    
}
