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
        ArrayList<Integer> al = new ArrayList<>();
        for(ListNode list : lists){
            while(list != null){
                al.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(al);

        ListNode node = new ListNode(0);
        ListNode curr = node;
        for(int num : al){
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return node.next;
    }
}
