/**
 * Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 */

class Solution {
 ListNode merge (ListNode head1 , ListNode head2)
    {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(head1!=null && head2!=null)
        {
            if(head1.val<=head2.val)
            {
                tail.next=head1;
                head1=head1.next;
            }
            else
            {
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        tail.next = head1!=null ? head1 :head2;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int l=lists.length;
        if(l==0) return null;
        for(int i=1;i<l;i++)
        {
            lists[i]=merge(lists[i],lists[i-1]);
        }
        return lists[l-1];
    }
}
