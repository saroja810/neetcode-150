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
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        HashSet<ListNode> hs = new HashSet<>();
        while(p != null){
            if(!hs.add(p)){
                return true;
            }
            p = p.next;
        }
        return false;
    }
}
