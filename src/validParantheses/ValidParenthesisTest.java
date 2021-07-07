package validParantheses;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {
    static ValidParenthesis validParenthesis;

    @BeforeAll
    static void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    void isValid() {
        assertFalse(validParenthesis.isValid("(()("));
        assertFalse(validParenthesis.isValid("[[[]"));
        assertTrue(validParenthesis.isValid("{[]}"));
        assertFalse(validParenthesis.isValid("([)]"));
        assertTrue(validParenthesis.isValid("()[]{}"));
        assertTrue(validParenthesis.isValid("()"));
        assertFalse(validParenthesis.isValid("({{{{}}}))"));
        assertFalse(validParenthesis.isValid("({[)"));
    }

}