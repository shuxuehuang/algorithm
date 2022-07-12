package linkedlist;

public class Solution206 {
    //反转链表
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode l1 = head;
        ListNode temp = null;
        ListNode newList = null;

        while(l1 != null){
            temp = l1;
            if(newList == null){
                newList = temp;
            }
            temp.next = newList;
            newList =temp;
            l1 = l1.next;
        }
        return newList.next;
    }
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
