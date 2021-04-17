/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Loan {
    private int loanAmount;
    private double interestRate;
    private int years;

    public Loan(int loanAmount, double interestRate, int years) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.years = years;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getYeras() {
        return years;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setYeras(int years) {
        this.years = years;
    }
    
    public double interest(){
        return loanAmount*interestRate*years;
    } 

    @Override
    public String toString() {
        return "loanAmount= $" + loanAmount +
               "\tInterest Rate= " + interestRate+ "%" 
                +"\tNo of years= " + years+
                "\tInterest= $"+interest();
    }
    
    
}
