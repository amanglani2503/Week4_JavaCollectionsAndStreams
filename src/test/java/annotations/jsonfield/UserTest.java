package annotations.jsonfield;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JsonSerializerTest {

    @Test
    void testJsonSerialization() {
        User user = new User("john_doe", "john@example.com", 25);
        String expectedJson = "{username: john_doe, email_address: john@example.com}";

        String actualJson = JsonSerializer.toJson(user);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    void testEmptyObjectSerialization() {
        User emptyUser = new User("", "", 30);
        String expectedJson = "{username: , email_address: }";

        String actualJson = JsonSerializer.toJson(emptyUser);

        assertEquals(expectedJson, actualJson);
    }
}
