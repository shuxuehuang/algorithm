package linkedlist;

import java.sql.ClientInfoStatus;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        //删除重复元素
        if (head.next == null){
            return null;
        }
        ListNode newHead = head;
        ListNode pre = head;
        ListNode p1 = head.next;
        while(p1 != null){
            if(pre.val == p1.val){
                pre.next = p1.next;
                p1 = p1.next;
            }else {
                pre = p1;
                p1 = pre.next;
            }
        }
        return newHead;
    }
}
