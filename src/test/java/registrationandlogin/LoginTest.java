package registrationandlogin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    Login login = new Login();

    @Test
    public void testLoginSuccessful() {
        boolean result = login.loginUser("kyl_1", "Ch&&sec@ke99!", "kyl_1", "Ch&&sec@ke99!");
        assertTrue(result);
        assertTrue(login.returnLoginMessage(result).contains("Welcome"));
    }
    @Test
    public void testLoginFailed() {
        boolean result = login.loginUser("kyl_1", "wrong", "kyl_1", "Ch&&sec@ke99!");
        assertFalse(result);
        assertTrue(login.returnLoginMessage(result).contains("Username or password incorrect"));
    }
    @Test
    public void testReturnLoginStatusTrue() {
        assertTrue(login.returnLoginStatus(true));
    }
    @Test
    public void testReturnLoginStatusFalse() {
        assertFalse(login.returnLoginStatus(false));
    }
}