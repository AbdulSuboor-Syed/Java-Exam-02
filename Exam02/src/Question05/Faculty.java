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
public class Faculty extends Employee {

    private int officeHours;
    private int noOfTeachingSubjects;

    public Faculty(int officeHours, int noOfTeachingSubjects, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public int getNoOfTeachingSubjects() {
        return noOfTeachingSubjects;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public void setNoOfTeachingSubjects(int noOfTeachingSubjects) {
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice Hours: " + getOfficeHours()
                + "\nNo of teaching subjects: " + getNoOfTeachingSubjects();
    }

}
