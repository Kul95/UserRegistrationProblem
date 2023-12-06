package org.example;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String firstName) throws Exception {
        if (Pattern.matches("[A-Z][a-z]{2,}", firstName))
            return true;
        else
            throw new Exception("You enter Invalid First Name");
    }

    public boolean lastName(String lastName) throws Exception {
        if (Pattern.matches("[A-Z][a-z]{2,}", lastName))
            return true;
        else
            throw new Exception("You enter Invalid Last Name");
    }

    public boolean emailValidation(String email) throws Exception {
        if (Pattern.matches("^[a-zA-Z\\\\d]{1,1}[a-zA-Z\\\\d+_.-]+@[a-zA-Z]+.[a-zA-z.]{2,}$", email))
            return true;
        else
            throw new Exception("You entered invalid mail");
    }
}
