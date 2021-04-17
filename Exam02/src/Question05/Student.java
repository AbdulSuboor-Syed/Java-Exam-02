/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Student extends Person {

    private double grade;
    public static final String STATUS = "Graduate";

    public Student(String name, String address, String phoneNumber, String emailAddress, double grade) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nGrade:" + getGrade()
                + "\nStatus: " + STATUS;
    }

}
