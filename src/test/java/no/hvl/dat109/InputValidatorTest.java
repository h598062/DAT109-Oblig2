package no.hvl.dat109;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {
    InputValidator iv = new InputValidator();

    @Test
    void testValiderTlf() {
        assertTrue(InputValidator.validerTlf("+4798765432"));
        assertTrue(InputValidator.validerTlf("98765432"));
        assertFalse(InputValidator.validerTlf("+47abc"));
        assertFalse(InputValidator.validerTlf("abc"));
    }
}