package annotations.deprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();  // Will show a warning
        api.newFeature();
    }
}