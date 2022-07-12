package linkedlist;

public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode temp = head;
        ListNode p1 = odd;
        ListNode p2 = even;
        int sum = 1;
        while(temp != null){
            ListNode next = temp.next;
            if(sum % 2 != 0){
                //奇数节点
                temp.next = odd.next;
                odd.next = temp;
                odd = odd.next;
            }else {
                //偶数节点
                temp.next = even.next;
                even.next = temp;
                even = even.next;
            }
            temp = next;
            sum++;
        }
        odd.next = p2.next;
        return p1.next;
    }
}
