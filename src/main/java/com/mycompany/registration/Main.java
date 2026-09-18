package com.mycompany.registration;
import com.mycompany.registration.Login;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login loginSystem = new Login();

        System.out.println("=== REGISTRATION ===");
        
        System.out.print("Enter firstname: ");
        String firstname = input.nextLine();
        
        System.out.print("Enter lastname: ");
        String lastname = input.nextLine();
        
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        System.out.print("Enter cell: ");
        String cell = input.nextLine();

        String message = loginSystem.registerUser(username, password);
        System.out.println(message);

        // Only allow login if registration was successful
        if (message.equals("User registered successfully.")) {
            System.out.println("\n=== LOGIN ===");
            System.out.print("Enter username: ");
            String enteredUser = input.nextLine();
            System.out.print("Enter password: ");
            String enteredPass = input.nextLine();

            boolean loggedIn = loginSystem.loginUser(enteredUser, enteredPass, username, password);
            System.out.println(loginSystem.returnLoginStatus(loggedIn));
        }
    }
}

   