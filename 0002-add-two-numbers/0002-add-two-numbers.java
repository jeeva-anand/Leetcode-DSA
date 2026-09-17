class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        

        
        
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        int carry = 0;

        while(l1 != null || l2 != null){
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;

            ListNode res = new ListNode(sum % 10 );
            carry = sum / 10;
            temp.next = res;
            temp = res;            

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }

        if(carry != 0 ) temp.next = new ListNode(carry);

        return newHead.next;
    }
}