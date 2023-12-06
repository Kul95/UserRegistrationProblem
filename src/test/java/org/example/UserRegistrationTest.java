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

    @Test
    public void testEmailValidation() {
        boolean email = false;
        try {
            email = userRegistration.emailValidation("abc.xyz@bl.co,in");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void validateMobilePositive() {
        boolean mobile = false;
        try {
            mobile = userRegistration.phoneNumberValidation("+91-67891679");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validatePassword() {
        boolean actual2 = false;
        try {
            actual2 = userRegistration.passwordValidation("Swapnil@123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
