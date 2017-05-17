import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LuhnTestTest {

    @Test
    public void all_digits_zero() {
        assertTrue(LunhTest.isValid(00000000000));
    }
}
