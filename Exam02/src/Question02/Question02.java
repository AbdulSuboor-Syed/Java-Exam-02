/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

import java.util.Scanner;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Question02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[][] l1 = new int[3][3];
        for (int i = 0; i < l1.length; i++) {
            for (int j = 0; j < l1[i].length; j++) {
                l1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        int[][] l2 = new int[3][3];
        for (int i = 0; i < l2.length; i++) {
            for (int j = 0; j < l2[i].length; j++) {
                l2[i][j] = sc.nextInt();
            }
        }
        if (equals(l1, l2) == true) {
            System.out.println("The two arrays are strictly identical");
        } 
        else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(m1[i][j] == m2[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

}
