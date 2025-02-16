package annotations.maxlength;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testValidUsername() {
        User user = new User("JohnDoe");  // Within max length
        assertEquals("JohnDoe", user.getUsername());
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("JohnathanDoe");  // Exceeds max length
        });

        assertTrue(exception.getMessage().contains("Username exceeds max length of 10"));
    }
}
