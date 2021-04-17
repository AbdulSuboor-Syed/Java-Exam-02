/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Question03 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
		// Create an array list of objects
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(new Loan(1000,2.5,2));		
		obj.add(new Date());		
		obj.add(new String("Java Exam 02"));	
		obj.add(new Circle(2));	
                for(Object o:obj){
                    System.out.println(o.toString());
                }
	}
}
