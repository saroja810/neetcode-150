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
    //Using Stack
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode p = head;
        while(p != null){
            st.push(p.val);
            p = p.next;
        }
        p = head;
        while(!st.isEmpty()) {
            p.val = st.pop();
            p = p.next;
        }
        return head;
    }
}
