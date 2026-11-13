/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.mbro.mavenprojectoop;
import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author thoma
 */
public class vehicleManager {
    private HashMap<Integer, vehicle> vehicles = new HashMap<>(); // create the record table for vehicles
    private final Scanner scanner;
    
    
    public vehicleManager(Scanner scanner) {
        this.scanner = scanner; // allows main scanner to be used from here 
    }
    //creates vehicle record
    public void addvehicle(User owner){
        //slects types
        System.out.println("Select a vehicle ");
        System.out.println("1.Car \n 2.Motorbike \n 3.Bus \n 4.Off-road");
        String choice = scanner.nextLine().trim().toLowerCase();
        
        // inputs make, model ect.
        System.out.println("Please enter the make.");
        String make = scanner.nextLine().trim();
        System.out.println("Please enter the model.");
        String model = scanner.nextLine().trim();
        System.out.println("Please enter the mileage. ");
        String mileage = scanner.nextLine();
        
        // creates the switch for which vehicle you choose
        vehicle vehicle = null;
        switch (choice){
            case "1":
            case "car":
                vehicle = new car(make, model, mileage, owner);
                break;
                
            case "2":
            case "motorbike":
                vehicle = new motorbike (make, model, mileage, owner);
                break;
                
            case "3":
            case "bus":
                vehicle = new bus (make, model, mileage, owner);
                break;
                
            case "4":
            case "offroad":
                vehicle = new offroad(make, model, mileage, owner);
                break;
                
            
        }
    vehicles.put(vehicle.getId(), vehicle);
    owner.addVehicle(vehicle);
        System.out.println("Added:: " + vehicle);
    
        
        
    }
    // shows user all vehicles registered to them
    public void showvehicles(User owner){
        if (owner.getVehicles().isEmpty()){
            System.out.println("No vehicles registered");
            return;
            
        }
        for (vehicle v : owner.getVehicles()){
            System.out.println(v);
        }
    }
    // allows user to find a vehicle by its id number
    public void findvehicle(){
        int id = readnumber ("Enter vehicle id");
        vehicle v = vehicles.get(id);
        if (v == null){
            System.out.println("No vehicle found.");
        }else {
            System.out.println(v);
        }
    }
    // asks until user enters a whole number reusability
    private int readnumber(String prompt){
        while(true){
            System.out.println(prompt);
            try{
                return Integer.parseInt(scanner.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.println("Please enter a whole number");
            }
        }
    }
    
}
