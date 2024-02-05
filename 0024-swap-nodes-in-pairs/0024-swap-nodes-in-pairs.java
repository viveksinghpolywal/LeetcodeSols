class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail = swapPairs(head.next.next);
        
        ListNode temp = head;
        head = head.next;
        head.next = temp;
        temp.next = tail;
        
        return head;
    }
}