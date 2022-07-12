package linkedlist;

public class Solution24 {
    //交换两个相邻的结点
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while(temp.next != null && temp.next.next != null){
            ListNode left = temp.next;
            ListNode right = temp.next.next;
            temp.next = right;
            left.next = right.next;
            right.next = left;
            temp = left;
        }
        return dummyHead.next;
    }
}
