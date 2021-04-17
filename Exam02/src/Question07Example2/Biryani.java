/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07Example2;

/**
 *
 * @author Syed Abdul Suboor
 */
public enum Biryani {
    SINGLE(10,12.50),FAMILY(25,29.99),JUMBO(40,44.99);
    private double dineInPrice;
    private double diliveryCharges;

    private Biryani(double dineInPrice, double diliveryCharges) {
        this.dineInPrice = dineInPrice;
        this.diliveryCharges = diliveryCharges;
    }

    public double getDineInPrice() {
        return dineInPrice;
    }

    public double getDiliveryCharges() {
        return diliveryCharges;
    }
    
}
