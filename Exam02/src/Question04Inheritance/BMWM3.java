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
public class BMWM3 extends Cars{
   
    private String engineType;

    public BMWM3(String engineType, String engineModel, String tires, int maxSpeed) {
        super(engineModel, tires, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    
    @Override
    public String carService(){
        return "A BWM car requires servicing after 1000 miles";
    }

    @Override
    public String toString() {
        return super.toString()+"\nEngine type:"+ getEngineType();
    }
    
}
