package day5junit.advance.userregistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("john_doe", "john.doe@example.com", "SecurePass123"));
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "valid@example.com", "SecurePass123"));
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("john_doe", "invalid-email", "SecurePass123"));
        assertEquals("Invalid email format.", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("john_doe", "john.doe@example.com", "short"));
        assertEquals("Password must be at least 8 characters long.", exception.getMessage());
    }
}
