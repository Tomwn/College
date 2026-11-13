/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.mbro.mavenprojectoop;

/**
 *
 * @author thoma
 */
// creates extended bike class from vehicle
public class motorbike extends vehicle {
    
      public motorbike (String make, String model, String mileage, User owner){
    super (make, model, mileage, owner);
    }
   // returns that the type is motorbike
    public String getType(){
        return "motorbike";
        
    }
    
    
    
}
