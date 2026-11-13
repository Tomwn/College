/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.mbro.mavenprojectoop;

import java.util.ArrayList;

/**
 *
 * @author thoma
 */
// creates the class for user with the variables imbedded 
public class User {
    private static int nextid =1;
    
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private ArrayList<vehicle> vehicles = new ArrayList<>();
   
    
    public User(String name, String email, String phone, String password){
        this.id = nextid++;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        }
    
    public void addVehicle (vehicle vehicle){
        vehicles.add(vehicle);
    }
    public int getid(){ return id;}
    public String getphone(){return phone;}
    public String getname(){ return name;}
    public String getemail(){return email;}
    public ArrayList<vehicle> getVehicles(){ return vehicles;}
   
    
    public boolean checkpassword (String attempt){
        return password.equals(attempt);
        

    }
    
    
    
    
}
