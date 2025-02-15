package day5junit.basic.databaseconnection;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    private DatabaseConnection database;

    @BeforeEach
    void setUp() {
        database = new DatabaseConnection();
        database.connect(); // Connect before each test
    }

    @AfterEach
    void tearDown() {
        database.disconnect(); // Disconnect after each test
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(database.isConnected(), "Database should be connected");
    }

    @Test
    void testConnectionIsClosed() {
        database.disconnect();
        assertFalse(database.isConnected(), "Database should be disconnected");
    }
}
