import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LuhnTestTest {

    @Test
    public void all_digits_zero() {
        assertTrue(LunhTest.isValid("00000000000"));
    }

    @Test
    public void all_zero_except_one_digit() {
        assertFalse(LunhTest.isValid("00000000001"));
    }

    @Test
    public void all_zero_except_two_digits_in_odd_positions() {
        assertTrue(LunhTest.isValid("00000000505"));
    }

    @Test
    public void all_zero_except_three_digits_in_the_last_positions() {
        assertTrue(LunhTest.isValid("00000000216"));
    }
}
