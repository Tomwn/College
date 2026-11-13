/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.mbro.mavenprojectoop;


/**
 *
 * @author thoma
 */
// creates the main class from which types of vehicles draw attributes
public abstract class vehicle {
    private static int nextId =1;
    
    private int id;
    private String make;
    private String model;
    private String mileage;
    private User owner;
    
    public vehicle(String make, String model, String mileage, User owner){
        this.id = nextId++;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.owner = owner;
    }
        
    public int getId(){return id;}
    public String getmake(){return make;}
    public String getmodel(){ return model;}
    public String getmileage(){return mileage;}
    public User getowner(){return owner;}
    

    
    
    
}
