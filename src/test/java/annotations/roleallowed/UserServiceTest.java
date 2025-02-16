package annotations.roleallowed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class UserServiceTest {
    private UserService userService;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        userService = new UserService();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testDeleteUserAnnotation() throws NoSuchMethodException {
        Method deleteUserMethod = UserService.class.getMethod("deleteUser");
        assertTrue(deleteUserMethod.isAnnotationPresent(RoleAllowed.class));
        assertEquals("ADMIN", deleteUserMethod.getAnnotation(RoleAllowed.class).value());
    }

    @Test
    void testViewProfileAnnotation() throws NoSuchMethodException {
        Method viewProfileMethod = UserService.class.getMethod("viewProfile");
        assertTrue(viewProfileMethod.isAnnotationPresent(RoleAllowed.class));
        assertEquals("USER", viewProfileMethod.getAnnotation(RoleAllowed.class).value());
    }

    @Test
    void testDeleteUserAccessDenied() {
        AccessControlManager.invokeIfAllowed(userService, "deleteUser");
        assertTrue(outContent.toString().contains("Access Denied! Insufficient permissions."));
    }

    @Test
    void testViewProfileAllowed() {
        AccessControlManager.invokeIfAllowed(userService, "viewProfile");
        assertTrue(outContent.toString().contains("User profile displayed."));
    }
}
