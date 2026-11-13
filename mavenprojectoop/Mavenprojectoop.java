/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uk.ac.mbro.mavenprojectoop;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author thoma
 */
public class Mavenprojectoop {
    private static Scanner scanner = new Scanner(System.in); //system input
        private static UserManager Usermanager = new UserManager(scanner); //allows use of user manager
    private static vehicleManager vehicleManager = new vehicleManager(scanner); //allows use of vehicle manager
// questions if running
    public static void main(String[] args) {
        boolean running = true;
      while (running){
          if (Usermanager.isLoggedIn()){
              usermenu();
          }else{
              running = startmenu();
          }
      }
        System.out.println("Goodbye");
     
        
    }           
    // outputs start menu choices
    private static boolean startmenu(){
        System.out.println("=== Welcome ===");
        System.out.println("1.Create user \n 2.Login \n 3.Exit");
        System.out.println("Please select an option");
        // creates choice input for menu
        String choice = scanner.nextLine().trim().toLowerCase();
        // provides the switch and sends to correct method
        switch (choice){
            case "1":
            case "create user":
                Usermanager.createuser();
                break;
                
            case"2":
            case"login":
                Usermanager.loginuser();
                break;
            
            case"3":
            case"exit":
                return false;
            // provides invalid option and reloops    
            default:
                System.out.println("Invalid please select an option provided");
                    
        }
        return true;
    }
    // creates the user menu provides options
    private static void usermenu(){
        
        User user = Usermanager.getcurrentUser(); // finds which user is currently signed in
        System.out.println("Welcome" + user.getname());
        System.out.println("1.Add a vehicle \n 2.My vehicles");
        System.out.println("3.find a vehicle by id \n 4.Log out");
        System.out.println("Please select an option");
        
        String choice = scanner.nextLine().trim().toLowerCase();
        
        switch (choice){
            
            case"1":
            case"add a vehicle":
                vehicleManager.addvehicle(user);
                break;
                
            case"2":
            case"my vehicles":
                vehicleManager.showvehicles(user);
                break;
                
            case"3":
            case"find a vehicle by id":
                vehicleManager.findvehicle();
                break;
                
            case"4":
            case"log out":
            case"logout":
                Usermanager.logout();
                break;
                
            default:
                System.out.println("Please select a valid option");
                
                
            
        }
    }
}
