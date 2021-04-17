/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Syed Abdul Suboor
 */
public class SodaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOU NAME: ");
        String name=scan.next();
        String retail = " ";
        String wholeSale = " ";
        System.out.println("-------------------------------------------------");
        System.out.println("WELCOME TO THE WHAREHOUSE "+name);
        System.out.println("-------------------------------------------------");
        do {
            System.out.print("Would you like to know the Retail Cost (YES/NO): ");
            retail = scan.next();
            if (retail.equalsIgnoreCase("Yes")) {
                for (Soda r : Soda.values()) {
                    System.out.println(r + " Retail Cost is $" + r.getCost());
                }
            } else if (retail.equalsIgnoreCase("NO")) {
                System.out.println("OK");
            } else {
                System.out.println("Please Enter YES or NO");
            }
        } while (!(retail.equalsIgnoreCase("Yes")) && (!(retail.equalsIgnoreCase("NO"))));
            System.out.println("*********************************************");
        do {
            System.out.print("Would you like to know the Whole sale cost(Yes/No): ");
            wholeSale = scan.next();
            if (wholeSale.equalsIgnoreCase("yes")) {
                for (Soda w : Soda.values()) {
                    System.out.println(w + " Whole sale cost is $" + w.getWholeSaleCost());
                }
            } else if (wholeSale.equalsIgnoreCase("No")) {
                System.out.println("OK");
            }
            else{
                System.out.println("Please Enter YES or NO");
            }
        } while (!(wholeSale.equalsIgnoreCase("Yes")) && (!(wholeSale.equalsIgnoreCase("No"))));
        System.out.println("**************************************************");
        System.out.println("THANK YOU FOR VISITING "+name);
    }

}
