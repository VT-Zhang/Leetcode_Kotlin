class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) {
            return listOf()
        }
        nums.sort()
        val result = mutableSetOf<List<Int>>()
        nums.forEachIndexed { idx, testInput ->
            val target = testInput * -1
            val twoSumTest = mutableListOf<IntArray>()
            val numsFiltered = nums.filterIndexed { idx2, _ -> idx2 != idx }
            var start = 0
            var end = numsFiltered.size - 1

            while (start < end) {
                val testSum = numsFiltered[start] + numsFiltered[end]
                when {
                    testSum == target -> {
                        twoSumTest.add(intArrayOf(numsFiltered[start], numsFiltered[end]))
                        start++
                    }
                    testSum < target -> {
                        start++
                    }
                    else -> {
                        end--
                    }
                }
            }
            twoSumTest.forEach { intArray ->
                result.add(listOf(testInput, intArray[0], intArray[1]).sorted())
            }
        }
        return result.toList()
    }
}