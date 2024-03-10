import static org.junit.Assert.*;
import org.junit.Test;

public class StringManipulatorClass2test {

    StringManipulatorClass2 manipulator = new StringManipulatorClass2();

    @Test
    public void testCapitalizeWords() {
        assertEquals("This Is A Test", manipulator.capitalizeWords("tHiS iS A tEsT"));
        assertEquals("Another Test Case", manipulator.capitalizeWords("ANOTHER tEsT cAsE"));
        assertEquals("Single", manipulator.capitalizeWords("single"));
    }

    @Test
    public void testRemoveNonAlphabetic() {
        assertEquals("HelloWorld", manipulator.removeNonAlphabetic("Hello!@#World"));
        assertEquals("OpenAI", manipulator.removeNonAlphabetic("OpenAI!@#"));
        assertEquals("JavaProgramming", manipulator.removeNonAlphabetic("JavaProgramming!@#"));
    }

    @Test
    public void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("Hello World", "World"));
        assertTrue(manipulator.containsSubstring("This is a test", "test"));
        assertFalse(manipulator.containsSubstring("Hello World", "OpenAI"));
    }

    @Test
    public void testMergeStrings() {
        assertEquals("HelloWorld", manipulator.MergeStrings("Hello", "World"));
        assertEquals("OpenAI", manipulator.MergeStrings("Open", "AI"));
        assertEquals("JavaProgramming", manipulator.MergeStrings("Java", "Programming"));
    }

    @Test
    public void testReverseWords() {
        assertEquals("world Hello", manipulator.reverseWords("Hello world"));
        assertEquals("test a is This", manipulator.reverseWords("This is a test"));
        assertEquals("sentence a is This", manipulator.reverseWords("This is a sentence"));
    }
}
