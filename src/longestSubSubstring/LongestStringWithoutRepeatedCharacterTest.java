package longestSubSubstring;

import longestSubSubstring.LongestStringWithoutRepeatedCharacter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringWithoutRepeatedCharacterTest {
    static LongestStringWithoutRepeatedCharacter longestStringWithoutRepeatedCharacter;

    @BeforeAll
    static void init(){
        longestStringWithoutRepeatedCharacter =new LongestStringWithoutRepeatedCharacter();
    }

    @Test
    void lengthOfLongestSubstring() {
        String input = "anviaj";
        assertEquals(5, longestStringWithoutRepeatedCharacter.lengthOfLongestSubstring(input));
        input ="dvdf";
        assertEquals(3, longestStringWithoutRepeatedCharacter.lengthOfLongestSubstring(input));
        input = "aaaaab";
        assertEquals(2, longestStringWithoutRepeatedCharacter.lengthOfLongestSubstring(input));
        input = " ";
        assertEquals(1, longestStringWithoutRepeatedCharacter.lengthOfLongestSubstring(input));
        input = "abcabcbb";
        assertEquals(3, longestStringWithoutRepeatedCharacter.lengthOfLongestSubstring(input));
        input = "bbbbb";
        assertEquals(1, longestStringWithoutRepeatedCharacter.lengthOfLongestSubstring(input));
        input = "pwwkew";
        assertEquals(3, longestStringWithoutRepeatedCharacter.lengthOfLongestSubstring(input));
    }
}