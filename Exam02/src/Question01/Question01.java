/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Question01 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        
        ArrayList<Integer> distinctList = new ArrayList<Integer>();        
        
        System.out.print("Enter ten integers: ");
        
        for (int i = 0; i < 10; i++) {
            distinctList.add(sc.nextInt());
        }
        
        System.out.println("-------------------------------------------------");
        
        for (int j = 0; j < 10; j++) {
            removeDuplicate(distinctList);
        }
        
        System.out.print("The distinct integers are ");
        
        for (int l:distinctList) {
            System.out.print(l + " ");
        }
        
        System.out.println(" ");
        
        System.out.println("*************************************************");
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            
            for (int j = i + 1; j < list.size(); j++) {
                
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }
}
