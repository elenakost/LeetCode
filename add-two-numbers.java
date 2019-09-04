/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode a = l1 , b = l2, curr = l3;
        int store = 0;
        while (a != null || b != null){
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            int total = x + y + store;
            store = total / 10;
            curr.next = new ListNode(total % 10);
            if (a != null) a = a.next;
            if (b != null) b = b.next;
            curr = curr.next;
        }
    if (store > 0) curr.next = new ListNode(store);
        
    return l3.next;   
    }
}
