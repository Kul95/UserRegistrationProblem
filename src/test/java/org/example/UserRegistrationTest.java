package org.example;

import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void testValidateFirstNameTestForPositive() {
        boolean name = false;
        try {
            name = userRegistration.firstName("Kuldeep");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void validateLastName() {
        boolean lastName = false;
        try {
            lastName = userRegistration.lastName("Kumar");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
