package me.consuegra.algorithms;

import me.consuegra.datastructure.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
 * is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpening(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else if (isValidClosing(s.charAt(i), stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpening(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private boolean isValidClosing(char ch, char top) {
        return (ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[');
    }

}
