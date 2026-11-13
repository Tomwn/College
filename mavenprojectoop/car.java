/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.mbro.mavenprojectoop;

/**
 *
 * @author thoma
 */
//creates car with vehicles attributes
public class car extends vehicle {
   
   public car (String make, String model, String mileage, User owner){
    super (make, model, mileage, owner);
    }
   
    public String getType(){
        return "car";
        
    }
    
}
