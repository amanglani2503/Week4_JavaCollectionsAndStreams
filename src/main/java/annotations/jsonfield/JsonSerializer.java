package annotations.jsonfield;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonSerializer {

    public static String toJson(Object obj) {
        try {
            Map<String, String> jsonMap = new LinkedHashMap<>(); // Preserve order
            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                if (!field.isAnnotationPresent(JsonField.class)) {
                    continue;
                }
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), field.get(obj).toString());
            }
            return jsonMap.toString().replace("=", ": ");  // Convert to JSON-like format
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return "{}";
        }
    }

    public static void main(String[] args) {
        User user = new User("john_doe", "john@example.com", 25);
        String jsonOutput = toJson(user);
        System.out.println("Serialized JSON: " + jsonOutput);
    }
}
