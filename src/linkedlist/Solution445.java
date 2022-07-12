package linkedlist;

public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int index = 0;//记录进位
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1 == null && l2==null){
            return null;
        }
        if (l1.val == 0){
            return l2;
        }
        if (l2.val == 0){
            return l1;
        }
        //先把链表反转了
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-1);
        ListNode newList = new ListNode(-1);
        while(l1 != null){
            ListNode next = l1.next;
            l1.next = head1.next;
            head1.next = l1;
            l1 = next;
        }
        while(l2 != null){
            ListNode next = l2.next;
            l2.next = head2.next;
            head2.next = l2;
            l2 = next;
        }
        l1 = head1.next;
        l2 = head2.next;
        while(l1 != null && l2 != null){
            ListNode listNode;
            if (l1.val + l2.val + index < 10){
                listNode = new ListNode(l1.val + l2.val + index);
                index = 0;
                //头插法插入新链表中
            }else {
                listNode = new ListNode((l1.val + l2.val +index) % 10);
                index = 1;

                //头插法插入新链表中
            }
            listNode.next = newList.next;
            newList.next = listNode;
            if (l1.next == null && l2.next == null && index == 1){
                ListNode listNode1 = new ListNode(index);
                listNode1.next = newList.next;
                newList.next = listNode1;
            }
            l1 = l1.next;
            l2 = l2.next;

        }
        while(l1 != null){
            ListNode listNode;
            if(l1.val + index < 10){
                listNode = new ListNode(l1.val + index);
                index = 0;
            }else {
                listNode = new ListNode((l1.val + index) % 10);
                index = 1;
            }
            listNode.next = newList.next;
            newList.next = listNode;
            if(l1.next == null && index == 1){
                ListNode listNode1 = new ListNode(index);
                listNode1.next = newList.next;
                newList.next = listNode1;

            }
            l1 = l1.next;
        }
        while(l2!= null){
            ListNode listNode;
            if(l2.val + index < 10){
                listNode = new ListNode(l2.val + index);
                index = 0;
            }else {
                listNode = new ListNode((l2.val + index) % 10);
                index = 1;
            }
            listNode.next = newList.next;
            newList.next = listNode;
            if(l2.next == null && index == 1){
                ListNode listNode1 = new ListNode(index);
                listNode1.next = newList.next;
                newList.next = listNode1;

            }
            l2 = l2.next;
        }
        return newList.next;


    }
}
