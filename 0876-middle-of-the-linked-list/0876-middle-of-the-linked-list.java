class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int MidIndex=count/2 + 1;
        temp=head;
        while(temp!=null){
            MidIndex--;
            if(MidIndex==0){
                break;
            }
            temp=temp.next;
        }

        return temp;
    }
}