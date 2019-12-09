class Solution {
    fun longestPalindrome(s: String): String {
        var ss = ""
        var t = ""
        var m = 0
        for (i in 0 until s.length) {
            for (j in i + m until s.length) {
                t = s.substring(i .. j)
                if (t == t.reversed()) {
                    if (t.length > ss.length) {
                        ss = t
                        m = ss.length
                    }
                }
            }
        }
        return ss
    }
}