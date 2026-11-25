package devops.examples.jenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {
    private final VowelCounter counter = new VowelCounter();

    @Test
    void testAllVowels() {
        assertEquals(5, counter.countVowels("aeiou"));
    }

    @Test
    void testUppercaseVowels() {
        assertEquals(5, counter.countVowels("AEIOU"));
    }

    @Test
    void testMixedCaseText() {
        assertEquals(3, counter.countVowels("Hello World"));
    }

    @Test
    void testTextWithoutVowels() {
        assertEquals(0, counter.countVowels("bcdfghjkl"));
    }

    @Test
    void testEmptyText() {
        assertEquals(0, counter.countVowels(""));
    }

    @Test
    void testNumbersAndSpecialCharacters() {
        assertEquals(2, counter.countVowels("Java 123! @#$"));
    }

    @Test
    void testRepeatedVowels() {
        assertEquals(6, counter.countVowels("aaaeee"));
    }

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class,
                () -> counter.countVowels(null));
    }
}