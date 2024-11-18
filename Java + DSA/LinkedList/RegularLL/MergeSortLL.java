package LinkedList.RegularLL;

import org.w3c.dom.ListNode;

public class MergeSortLL {
    private ListNode head = null;

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }

        ListNode mid = getMid(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = null;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = (slow==null)?head :slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
     private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h = null;
        ListNode t = null;
        while(list1!=null && list2!=null) {
            if(list1.value<=list2.value) {
                ListNode node = new ListNode(list1.value);
                if(h==null) {
                    h = node;
                    t = node;
                }
                else {
                    t.next = node;
                    t = node;
                }
                list1 = list1.next;
            }
            else  {
                ListNode node = new ListNode(list2.value);
                if(h==null) {
                    h = node;
                    t = node;
                }
                else {
                    t.next = node;
                    t = node;
                }
                list2 = list2.next;
            }
        }
            if(list2!=null) {
                t.next = list2;
            }
            if(list1!=null) {
                t.next = list1;
            }
        return h;
    }

    
    


    private class ListNode {
        private int value; // Its made private so that no other can access it 
        private ListNode next;
        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        MergeSortLL list = new MergeSortLL();
        
    }
}
