package validParantheses;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && isClosedChar(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }

        return stack.size() == 0;
    }

    public boolean isClosedChar(char s1, char s2) {
        return  ('(' == s1 && ')' == s2) || ('{' == s1 && '}' == s2) || ('[' == s1 && ']' == s2);
    }

}
