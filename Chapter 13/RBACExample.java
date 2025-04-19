import java.util.HashMap;
import java.util.Map;

public class RBACExample {
    private static final Map<String, String> userRoles = new HashMap<>();

    static {
        userRoles.put("faculty", "read,write,delete");
        userRoles.put("student", "read");
    }

    public static boolean hasPermission(String role, String action) {
        String permissions = userRoles.get(role);
        return permissions != null && permissions.contains(action);
    }

    public static void main(String[] args) {
        System.out.println("Faculty has delete permission: " + hasPermission("faculty", "delete"));
        System.out.println("Student has delete permission: " + hasPermission("student", "delete"));
    }
}
