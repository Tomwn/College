/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.mbro.mavenprojectoop;
import java.util.Scanner;
import java.util.HashMap;
        
    


/**
 *
 * @author thoma
 */
public class UserManager {
    private HashMap<Integer, User> users = new HashMap<>(); //creates the storage for users
    private User currentUser =null;
    private final Scanner scanner;
    public UserManager(Scanner scanner){
        this.scanner = scanner;
    }

// create user creation method storing the details 
public void createuser(){
    System.out.println("Enter your name");
    String name = this.scanner.nextLine().trim();
    System.out.println("Please enter your email");
    String email = scanner.nextLine().trim();
    System.out.println("please enter your phone number");
    String phone = this.scanner.nextLine().trim();
    System.out.println("please create a password");
    String password = this.scanner.nextLine().trim();

    User user = new User (name, email, phone, password);
users.put(user.getid(), user);
    System.out.println("Account created your id is" + user.getid());
    }

public void loginuser(){
    System.out.println("Please enter your id");
    int id;
    try{
    id = Integer.parseInt(scanner.nextLine().trim());
} catch(NumberFormatException e){
        System.out.println("This is not a valid ID");
        return;
}
    User user = users.get(id);
    if (user == null) {
        System.out.println("This is not a valid ID");
        return;
    }
    System.out.println("Please enter your password");
    String password = scanner.nextLine().trim();
    if(user.checkpassword(password)){
        currentUser = user;
        System.out.println("welcome" + user.getname());
    } else {
        System.out.println("Incorrect password please try again");
    }
    
    
}
// provides main with the logout method 
public void logout(){
    if (currentUser != null){
    System.out.println("Goodbye " + currentUser.getname());
}
    currentUser = null;
}
// provides main with whos logged in
public User getcurrentUser(){
    return currentUser;
    
}
// provides the main with if its logged in
public boolean isLoggedIn(){
    return currentUser  != null;
}



}
