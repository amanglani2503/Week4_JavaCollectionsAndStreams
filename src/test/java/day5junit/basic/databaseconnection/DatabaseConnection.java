package day5junit.basic.databaseconnection;

public class DatabaseConnection {
    private boolean connected;

    public void connect() {
        connected = true;
        System.out.println("Database Connected");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Database Disconnected");
    }

    public boolean isConnected() {
        return connected;
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        System.out.println("Is Connected? " + db.isConnected());
        db.disconnect();
        System.out.println("Is Connected? " + db.isConnected());
    }
}