class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (letter in s) {
            when (letter) {
                '(' -> stack.add(')')
                '[' -> stack.add(']')
                '{' -> stack.add('}')
                ')', ']', '}' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    if (stack.removeAt(stack.lastIndex) != letter) {
                        return false
                    }
                }
            }
        }
        if (stack.isNotEmpty()) {
            return false
        }
        return true
    }
}