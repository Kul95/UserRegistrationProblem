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
}
