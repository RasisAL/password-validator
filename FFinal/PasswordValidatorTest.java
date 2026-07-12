package FFinal;

import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidatorTest {

    // Black-box Tests 

    @Test
    public void testValidPassword() {
        PasswordValidator pv = new PasswordValidator("StrongPass");
        assertTrue(pv.isValidPassword());
    }

    @Test
    public void testMissingUppercase() {
        PasswordValidator pv = new PasswordValidator("weakpass");
        assertFalse(pv.isValidPassword());
    }

    @Test
    public void testMissingLowercase() {
        PasswordValidator pv = new PasswordValidator("WEAKPASS");
        assertFalse(pv.isValidPassword());
    }

    @Test
    public void testTooShortPassword() {
        PasswordValidator pv = new PasswordValidator("Abc"); //Less than 8
        assertFalse(pv.isValidPassword());
    }

    // White-box Tests 

    @Test
    public void testContainsUpper() {
        PasswordValidator pv = new PasswordValidator("Abcdabcd");
        assertTrue(pv.isValidPassword());
    }

    @Test
    public void testContainsLowerOnly() {
        PasswordValidator pv = new PasswordValidator("abcdefgh");
        assertFalse(pv.isValidPassword());
    }

    @Test
    public void testContainsUpperOnly() {
        PasswordValidator pv = new PasswordValidator("ABCDEFGH");
        assertFalse(pv.isValidPassword());
    }

    @Test
    public void testNullPassword() {
        PasswordValidator pv = new PasswordValidator(null);
        assertFalse(pv.isValidPassword());
    }
}
