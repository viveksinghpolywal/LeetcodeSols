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
    public boolean isPalindrome(ListNode head) 
    {    
        ListNode mid = middleNode(head);
        ListNode s = reverse(mid);
        ListNode f = head;
        while( head != null && s != null)
        {
            if(f.val != s.val)
            return false; 

             f = f.next;
             s = s.next;
        }
        return true;
    }

    public ListNode middleNode(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode mid)
    {    
        if(mid == null) return mid;
        ListNode prev = null;
        ListNode present = mid;
        ListNode then = present.next;
        while(present != null)
        {   
           present.next = prev;
           prev = present;
           present = then;
           if(then != null)
           then = then.next;
    
        }
        return prev;
    }
}