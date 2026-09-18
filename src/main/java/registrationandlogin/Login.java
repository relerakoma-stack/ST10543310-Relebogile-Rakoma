package registrationandlogin;

public class Login {
    
    public boolean loginUser(String username, String password, String storedUsername, String storedPassword) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }
    
    public String returnLoginMessage(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome kyl_1, it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
    
    public boolean returnLoginStatus(boolean status) {
        return status;
    }
}