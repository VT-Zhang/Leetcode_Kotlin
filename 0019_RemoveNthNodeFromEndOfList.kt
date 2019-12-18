/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val newHead = ListNode(-1).apply { next = head }
        var right = newHead
        var left = right
        for (i in 0 until n) {
            right = right.next
        }
        while (right.next != null) {
            right = right.next
            left = left.next
        }
        left.next = left.next.next
        return newHead.next
    }
}