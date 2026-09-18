package registrationandlogin;

public class Registration {
    
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;
        boolean hasUpper = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*");
        return hasUpper && hasNumber && hasSpecial;
    }

    public boolean checkCellPhoneNumber(String cell) {
        return cell.matches("\\+27\\d{9}");
    }

    public String registerUser(String username, String password, String cell) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        if (!checkCellPhoneNumber(cell)) {
            return "Cell phone number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        }
        return "User registered successfully.";
    }
}