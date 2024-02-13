/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 **/
 
 public class Solution {

    ListNode frontPointer;

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return isPalindrome2PointO(head);
    }

    private boolean isPalindrome2PointO(ListNode currentNode) {
        if (currentNode != null) {
            if (!isPalindrome2PointO(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }
}