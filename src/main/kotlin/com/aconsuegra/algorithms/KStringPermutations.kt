package com.aconsuegra.algorithms

/**
 * Print all permutations of a given string.
 */
class KStringPermutations {

    fun permutations(input: String): List<String> = permutations("", input, mutableListOf())

    private fun permutations(prefix: String, input: String, permutations: MutableList<String>): List<String> {
        when {
            input.isEmpty() -> permutations.add(prefix)
            else -> input.forEachIndexed { index, c ->
                permutations(prefix + c, input.substring(0, index) + input.substring(index + 1), permutations)
            }
        }
        return permutations
    }
}