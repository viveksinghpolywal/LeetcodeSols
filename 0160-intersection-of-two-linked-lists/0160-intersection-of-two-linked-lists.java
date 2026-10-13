/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // If either linked list is empty, intersection is not possible
        if (headA == null || headB == null) {
            return null;
        }

        // Find the last node of List A
        ListNode temp = headA;
        while(temp.next != null) {
            temp = temp.next;
        }

        // Connect the last node of List A to headA to create a cycle
        temp.next = headA;

        // Initialize slow and fast pointers at the head of List B
        ListNode slow = headB;
        ListNode fast = headB;

        // Use Floyd's Cycle Detection Algorithm to detect a cycle
        while(fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer by one step
            fast = fast.next.next;  // Move fast pointer by two steps

            // If both pointers meet, a cycle has been detected
            if(slow == fast) {
                break;
            }
        }

        // If no cycle is detected, the lists do not intersect
        if (fast == null || fast.next == null) {
            temp.next = null;
            return null;
        }

        // Reset slow pointer to the head of List B
        slow = headB;

        // Move both pointers one step at a time
        // They meet at the intersection node
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Restore List A by removing the temporary cycle
        temp.next = null;


        // Return the intersection node
        return slow;
    }
}