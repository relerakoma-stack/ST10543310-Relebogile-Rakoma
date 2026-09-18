package com.mycompany.registration;

public class Login {
    boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*].*");
    }
    String registerUser(String username, String password) {
        if (!checkUserName(username)) return "Username is not correctly formatted.";
        if (!checkPasswordComplexity(password)) return "Password is not correctly formatted.";
        return "User registered successfully.";
    }
    boolean loginUser(String enteredUser, String enteredPass, String realUser, String realPass) {
        return enteredUser.equals(realUser) && enteredPass.equals(realPass);
    }
    String returnLoginStatus(boolean isLoggedIn) {
        return isLoggedIn ? "Welcome! Login successful." : "Username or password incorrect.";
    }
}