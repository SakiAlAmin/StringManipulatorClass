import static org.junit.Assert.*;

import org.junit.Test;

public class StringManipulatorClass1Test {

    @Test
    public void testCalculateStringLength() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals(5, manipulator.calculateStringLength("hello"));
        assertEquals(0, manipulator.calculateStringLength(""));
        assertEquals(11, manipulator.calculateStringLength("Hello World"));
    }

    @Test
    public void testReverseString() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals("olleh", manipulator.reverseString("hello"));
        assertEquals("", manipulator.reverseString(""));
        assertEquals("dlroW olleH", manipulator.reverseString("Hello World"));
    }

    @Test
    public void testToLowerCase() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals("hello", manipulator.toLowerCase("HeLLo"));
        assertEquals("", manipulator.toLowerCase(""));
        assertEquals("hello world", manipulator.toLowerCase("Hello World"));
    }

    @Test
    public void testCountOccurrences() {
        StringManipulatorClass1 manipulator = new StringManipulatorClass1();
        assertEquals(2, manipulator.countOccurrences("hello", 'l'));
        assertEquals(0, manipulator.countOccurrences("", 'a'));
        assertEquals(2, manipulator.countOccurrences("hello world", 'o'));
    }

}
