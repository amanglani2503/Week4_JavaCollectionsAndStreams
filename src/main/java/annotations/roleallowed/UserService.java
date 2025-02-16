package annotations.roleallowed;

public class UserService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    @RoleAllowed("USER")
    public void viewProfile() {
        System.out.println("User profile displayed.");
    }
}