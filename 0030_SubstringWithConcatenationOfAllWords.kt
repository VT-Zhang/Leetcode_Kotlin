class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val ml = mutableListOf<Int>()
        if (s == "" || words.size == 0) {
            return ml
        }
        val w = words.sorted().groupingBy{ it }.eachCount()
        val ws = words[0].length * words.size
        for (i in 0 until s.length - ws + 1) {
            if (s.substring(i until i + ws)
                            .chunked(words[0].length)
                            .sorted()
                            .groupingBy{ it }
                            .eachCount()
                            .equals(w)) {
                ml.add(i)
            }
        }
        return ml
    }
}