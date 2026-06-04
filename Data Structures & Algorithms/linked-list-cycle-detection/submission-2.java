/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    //Using Slow Pointer & Fast Pointer
    public boolean hasCycle(ListNode head) {
        ListNode sp = head, fp = head;
        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
            if(sp == fp) return true;
        }
        return false;
    }
}
