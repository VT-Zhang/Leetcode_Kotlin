class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length <= 1) {
            return s.length
        }
        var set = hashSetOf<Char>()
        var i = 0
        var j = 0
        var max = 0
        while (j < s.length) {
            if (set.contains(s[j])) {
                set.remove(s[i])
                i++
            } else {
                set.add(s[j])
                j++
                max = Math.max(max, set.size)
            }
        }
        return max
    }
}