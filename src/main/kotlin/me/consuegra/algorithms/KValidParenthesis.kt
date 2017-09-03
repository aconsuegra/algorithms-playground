package me.consuegra.algorithms

import me.consuegra.datastructure.KStack

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
 * is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
class KValidParenthesis {

    fun isValid(input: String): Boolean {
        val stack = KStack<Char>()

        for (c in input) {
            when {
                isOpening(c) -> stack.push(c)
                stack.isEmpty() -> return false
                isValidClosing(c, stack.peek()) -> stack.pop()
                else -> return false
            }
        }
        return stack.isEmpty()
    }

    fun isOpening(input: Char) = input == '(' || input == '{' || input == '['

    fun isValidClosing(input: Char, top: Char)
            = input == ')' && top == '(' || input == '}' && top == '{' || input == ']' && top == '['

}
