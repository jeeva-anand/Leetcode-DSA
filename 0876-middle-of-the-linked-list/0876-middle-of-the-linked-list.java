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
    public ListNode middleNode(ListNode head) {
        
        ListNode tempHead = head;
        int len = 0;
        while( tempHead != null){
            len++;
            tempHead = tempHead.next;
        }

        int mid = len/2;

        tempHead = head;
        while(mid > 0 ){
            tempHead = tempHead.next;
            mid--;
        }

        return tempHead;

    }
}