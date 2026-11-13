/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.mbro.mavenprojectoop;

/**
 *
 * @author thoma
 */
// creates bus with vehicle attributes
public class bus extends vehicle {
    
       public bus (String make, String model, String mileage, User owner){
    super (make, model, mileage, owner);
    }
   
    public String getType(){
        return "bus";
        
    }
    
    
}
