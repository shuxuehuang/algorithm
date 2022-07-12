package linkedlist;

public class Solution19 {
    //删除倒数第n个结点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        //先计算链表的长度
        int length = 0;
        ListNode p1 = head;
        while(p1 != null){
            length++;
            p1 = p1.next;
        }
        int nTh = length - n;
        p1 = head;
        while(nTh > 1){
            p1 = p1.next;
            nTh--;
        }
        if(nTh == 1){
            p1.next = p1.next.next;
        }else {
            head = head.next;
        }


        return head;

    }
}
