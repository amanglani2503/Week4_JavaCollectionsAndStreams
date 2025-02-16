package annotations.roleallowed;

import java.lang.reflect.Method;

public class AccessControlManager {

    private static String currentUserRole = "USER"; // Simulating the logged-in user role

    public static void invokeIfAllowed(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
                if (annotation.value().equals(currentUserRole)) {
                    method.invoke(obj);
                } else {
                    System.out.println("Access Denied! Insufficient permissions.");
                }
            } else {
                method.invoke(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserService userService = new UserService();

        System.out.println("Trying to delete user:");
        invokeIfAllowed(userService, "deleteUser");

        System.out.println("Trying to view profile:");
        invokeIfAllowed(userService, "viewProfile");
    }
}