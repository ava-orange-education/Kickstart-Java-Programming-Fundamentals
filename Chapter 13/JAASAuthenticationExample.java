import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class JAASAuthenticationExample {
    public static void main(String[] args) {
        try {
            LoginContext loginContext = new LoginContext("ExampleApp");
            loginContext.login();
            System.out.println("Authentication successful!");
        } catch (LoginException e) {
            System.err.println("Authentication failed: " + e.getMessage());
        }
    }
}
