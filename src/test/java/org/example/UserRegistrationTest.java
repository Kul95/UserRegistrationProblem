package org.example;

import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void validateFirstNameTestForPositive() {
        boolean name = false;
        try {
            name = userRegistration.firstNameValidation("Kuldeep");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
