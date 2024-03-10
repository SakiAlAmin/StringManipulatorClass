import static org.junit.Assert.*;
import org.junit.Test;

public class StringManipulatorClass3test {

    StringManipulatorClass3 manipulator = new StringManipulatorClass3();

    @Test
    public void testIsPalindrome() {
        assertTrue(manipulator.isPalindrome("level"));
        assertTrue(manipulator.isPalindrome("LeVel"));
        assertFalse("Failed: Not a palindrome", manipulator.isPalindrome("hello"));
        assertTrue("Failed: Not a palindrome", manipulator.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testRemoveExtraSpaces() {
        assertEquals("Hello World", manipulator.removeExtraSpaces("  Hello   World  "));
        assertEquals("OpenAI", manipulator.removeExtraSpaces(" Open   AI "));
        assertEquals("Java Programming", manipulator.removeExtraSpaces(" Java    Programming  "));
        assertEquals("", manipulator.removeExtraSpaces("    "));
    }
}
