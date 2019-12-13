class Solution {
    fun intToRoman(num: Int): String {
        val romanList = listOf<Pair<Int, String>>(
                Pair(1000, "M"),
                Pair(900, "CM"),
                Pair(500, "D"),
                Pair(400, "CD"),
                Pair(100, "C"),
                Pair(90, "XC"),
                Pair(50, "L"),
                Pair(40, "XL"),
                Pair(10, "X"),
                Pair(9, "IX"),
                Pair(5, "V"),
                Pair(4, "IV"),
                Pair(1, "I")
        )
        var number: Int = num
        var index = 0
        var str = StringBuffer()
        while (number != 0) {
            if (number >= romanList[index].first) {
                val romanValue = romanList[index]
                number = number - romanValue.first
                str.append(romanValue.second)
            } else {
                index++
            }
        }
        return str.toString()
    }
}