import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import java.security.Principal;
import java.util.Set;

public class JAASAuthorizationExample {
    public static void main(String[] args) {
        try {
            // Assuming user is already authenticated via LoginContext
            LoginContext loginContext = new LoginContext("ExampmleApp");
            loginContext.login();
            Subject subject = loginContext.getSubject();

            // Adding a Principal (role) to the subject
            Principal adminPrincipal = new Principal() {
                public String getName() {
                    return "faculty";
                }
            };
            subject.getPrincipals().add(adminPrincipal);

            // Perform an action as the authenticated user
            performActionAsUser(subject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void performActionAsUser(Subject subject) {
        Set<Principal> principals = subject.getPrincipals();
        if (principals.stream().anyMatch(p -> "faculty".equals(p.getName()))) {
            System.out.println("Accessing secured resource as: " + principals);
            // Perform secured actions here
        } else {
            System.err.println("Access denied. User does not have required role.");
        }
    }
}
