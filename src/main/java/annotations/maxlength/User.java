package annotations.maxlength;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String username) {
        try {
            Field field = User.class.getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength annotation = field.getAnnotation(MaxLength.class);
                if (username.length() > annotation.value()) {
                    throw new IllegalArgumentException("Username exceeds max length of " + annotation.value());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        try {
            User validUser = new User("JohnDoe");  // Valid case
            System.out.println("Valid Username: " + validUser.getUsername());

            User invalidUser = new User("JohnathanDoe");  // Exceeds max length
            System.out.println("Invalid Username: " + invalidUser.getUsername());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}