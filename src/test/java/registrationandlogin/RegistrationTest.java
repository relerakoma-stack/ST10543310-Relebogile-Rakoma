package registrationandlogin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTest {
    Registration reg = new Registration();

    @Test
    public void testUserNameCorrectlyFormatted() {
        assertTrue(reg.checkUserName("kyl_1"));
    }
    @Test
    public void testUserNameIncorrectlyFormatted() {
        assertFalse(reg.checkUserName("kyle!!!!!!!"));
    }
    @Test
    public void testPasswordMeetsComplexity() {
        assertTrue(reg.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    @Test
    public void testPasswordDoesNotMeetComplexity() {
        assertFalse(reg.checkPasswordComplexity("password"));
    }
    @Test
    public void testCellNumberCorrectlyFormatted() {
        assertTrue(reg.checkCellPhoneNumber("+27838968976"));
    }
    @Test
    public void testCellNumberIncorrectlyFormatted() {
        assertFalse(reg.checkCellPhoneNumber("0896897631"));
    }
}