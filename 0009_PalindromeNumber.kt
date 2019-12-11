class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        var y = x
        var res = 0
        while (y != 0) {
            res = res * 10 + y % 10
            y /= 10
        }
        return x == res
    }
}