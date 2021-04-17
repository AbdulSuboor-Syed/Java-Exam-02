/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

/**
 *
 * @author Syed Abdul Suboor
 */
public enum Soda {
    
    Cocacola(10,8),Pepsi(11,8.20),Sprite(9.99,7.50);
    
    private double cost;
    private double wholeSaleCost;

    private Soda(double cost, double wholeSaleCost) {
        this.cost = cost;
        this.wholeSaleCost = wholeSaleCost;
    }

    public double getWholeSaleCost() {
        return wholeSaleCost;
    }

    public double getCost() {
        return cost;
    }

    
}
