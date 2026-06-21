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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(true){
            int minnode = -1;
            for(int i = 0; i < lists.length; i ++){
                if(lists[i] == null){
                    continue;
                }
                if(minnode == -1 || lists[minnode].val > lists[i].val){
                    minnode = i;
                }
            }
            if(minnode == -1){
                break;
            }

            curr.next = lists[minnode];
            lists[minnode] = lists[minnode].next;
            curr = curr.next;
        }
        return dummy.next;
    }
}
