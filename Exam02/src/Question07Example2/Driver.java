/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07Example2;

import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println(" WELCOME TO THE BIRYANI PLACE " );
        System.out.println("*******************************");
        System.out.print("Is the order to go or will you be joining us(Dine/Togo): ");
        String order=scan.next();
        System.out.println("*************************************************");
        if(order.equalsIgnoreCase("Dine")){
            System.out.println("The prices for biryani is as follows: ");
            for(Biryani b:Biryani.values()){
                System.out.println(b+"Price is: $"+b.getDineInPrice());
            }
        }else if(order.equalsIgnoreCase("Togo")){
            System.out.println("The Prices for biryani is as follows: ");
            for(Biryani b1:Biryani.values()){
                System.out.println(b1+" Price is: $"+b1.getDiliveryCharges());
            }
        }else{
            System.out.println("Please try again");
        }
        
        
    }
    
}
