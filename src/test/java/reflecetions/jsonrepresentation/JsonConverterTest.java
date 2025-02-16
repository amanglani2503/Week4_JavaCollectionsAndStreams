package reflecetions.jsonrepresentation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JsonConverterTest {

    @Test
    void testToJson() throws IllegalAccessException {
        Employee emp = new Employee();
        String expectedJson = "{\"name\": \"Alice\", \"salary\": \"50000\"}";
        assertEquals(expectedJson, JsonConverter.toJson(emp));
    }

    static class TestPerson {
        private String firstName = "John";
        private String lastName = "Doe";
        private double height = 5.9;
    }

    @Test
    void testToJsonWithDifferentObject() throws IllegalAccessException {
        TestPerson person = new TestPerson();
        String expectedJson = "{\"firstName\": \"John\", \"lastName\": \"Doe\", \"height\": \"5.9\"}";
        assertEquals(expectedJson, JsonConverter.toJson(person));
    }
}
