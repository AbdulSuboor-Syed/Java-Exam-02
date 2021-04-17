/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question04Inheritance;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Cars {
    private String engineModel;
    private String tires;
    private int maxSpeed;

    public Cars(String engineModel, String tires, int maxSpeed) {
        this.engineModel = engineModel;
        this.tires = tires;
        this.maxSpeed = maxSpeed;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public String getTires() {
        return tires;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public String carService(){
        return "Generally car servicing should be done after 2000 miles ";
    }
    @Override
    public String toString() {
        return "EngineModel: " + engineModel 
                +"\nTires: " + tires +
                "\nMax Speed: " + maxSpeed 
                +"\nServicing: "+carService();
    }
    
    
    
}
