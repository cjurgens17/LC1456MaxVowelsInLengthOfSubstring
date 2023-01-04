import static org.junit.Assert.*;

public class LC1456Test {

    @org.junit.Test
    public void maxVowelSubarray() {

        int actual1 = LC1456.maxVowelSubarray("abciiidef", 3);
        int actual2 = LC1456.maxVowelSubarray("aeiou", 2);
        int actual3 = LC1456.maxVowelSubarray("leetcode", 3);

        assertEquals(3, actual1);
        assertEquals(2, actual2);
        assertEquals(2,actual3);
    }

    @org.junit.Test
    public void isVowel() {

        boolean actual1 = LC1456.isVowel('a');
        boolean actual2 = LC1456.isVowel('f');

        assertTrue(actual1);
        assertFalse(actual2);
    }
}