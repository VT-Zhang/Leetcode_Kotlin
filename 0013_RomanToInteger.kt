class Solution {
    fun romanToInt(s: String): Int {
        val map = mapOf<Char, Int>(
                'I' to 1,
                'V' to 5,
                'X' to 10,
                'L' to 50,
                'C' to 100,
                'D' to 500,
                'M' to 1000
        )
        var sum = 0
        var i = 0
        while (i < s.length - 1) {
            var num1 = map.get(s.get(i)) ?: 0
            var num2 = map.get(s.get(i + 1)) ?: 0
            if (num2 > num1) {
                sum += (num2 - num1)
                i += 2
            } else {
                sum += num1
                i += 1
            }
        }
        if (i < s.length) {
            sum += map.get(s.get(s.length - 1)) ?: 0
        }
        return sum
    }
}