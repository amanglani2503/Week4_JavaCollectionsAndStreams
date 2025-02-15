package day5junit.advance.passwordvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValidPassword("Password1"), "Valid password should pass");
        assertTrue(PasswordValidator.isValidPassword("Secure123"), "Valid password should pass");
        assertTrue(PasswordValidator.isValidPassword("ValidPass1"), "Valid password should pass");
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.isValidPassword("pass"), "Too short, should fail");
        assertFalse(PasswordValidator.isValidPassword("weakpwd"), "No digit, should fail");
        assertFalse(PasswordValidator.isValidPassword("helloworld1"), "No uppercase letter, should fail");
        assertFalse(PasswordValidator.isValidPassword("Short1"), "Less than 8 characters, should fail");
    }
}
