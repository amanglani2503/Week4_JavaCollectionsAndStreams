package reflecetions.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\": \"")
                    .append(field.get(obj)).append("\", ");
        }

        if (json.length() > 1) json.setLength(json.length() - 2);
        json.append("}");

        return json.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Employee emp = new Employee();
        System.out.println(toJson(emp));
    }
}