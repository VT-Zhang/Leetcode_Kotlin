class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var res: Long = 0L
        var minDiff = Int.MAX_VALUE
        nums.sort()
        for (i in 0 until nums.size - 2) {
            var j = i + 1
            var k = nums.size - 1
            while (j < k) {
                val currSum = nums[i] + nums[j] + nums[k]
                when {
                    currSum == target -> return currSum
                    currSum < target -> j++
                    else -> k--
                }
                if (minDiff > Math.abs(currSum - target)) {
                    minDiff = Math.abs(currSum - target)
                    res = currSum.toLong()
                }
            }
        }
        return res.toInt()
    }
}