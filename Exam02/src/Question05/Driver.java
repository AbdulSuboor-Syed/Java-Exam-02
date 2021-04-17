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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Suboor", "123 Street",
                "123-456-1234", "Suboor@abc.com");
        System.out.println(p);
        System.out.println("-------------------------------------------------");
        Student s = new Student("Nawaz", "456 Street", "456-123-6789",
                "Nawaz@abc.com", 3.5);
        System.out.println(s);
        System.out.println("-------------------------------------------------");
        Employee e = new Employee("Owens Library", 20000, "02/24/2010", "Vinay", "567 Street", "890-123-456",
                 "Vinay@abc.com");
        System.out.println(e);
        System.out.println("-------------------------------------------------");
        Faculty f = new Faculty(20, 10, "International Office", 100000, "03/11/2019",
                "Megan", "678 Street", "345-890-1234", "Megan@abc.com");
        System.out.println(f);
        System.out.println("-------------------------------------------------");
        Staff st = new Staff("GA", "Adminstration", 2000, "04/01/2020", "Mike", "890 Street",
                 "908-546-7890", "Mike@abc.com");
        System.out.println(st);
    }
}
