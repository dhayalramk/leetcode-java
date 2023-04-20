class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode();
        ListNode move = ans;
        while(l1 != null || l2 != null){
            int l1Val = 0;
            int l2Val = 0;
            if(l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                l2Val = l2.val;
                l2 = l2.next;
            }
            int sum = l1Val + l2Val + carry;
            carry = sum / 10;
            sum %= 10;
            move.next = new ListNode(sum);
            move = move.next;
        }
        if(carry != 0) move.next = new ListNode(carry);
        return ans.next;
    }
}