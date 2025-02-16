package annotations.jsonfield;

public class User {

    @JsonField(name = "username")
    private String userName;

    @JsonField(name = "email_address")
    private String email;

    private int age; // Not annotated, won't be serialized

    public User(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }
}