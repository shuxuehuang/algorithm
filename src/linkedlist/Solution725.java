package linkedlist;

public class Solution725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] listNodes = new ListNode[k];
        //计算链表总长度
        int length = 0;
        ListNode p1 = head;
        while(p1 != null){
            length++;
            p1 = p1.next;
        }
        int quotient = length / k;
        int remainder = length % k;
        int lastLength = k-remainder;
        p1 = head;

        //前remainder段长度为quotient+1,后k-remainder段长度为quotient
        for (int i = 0; i < k && p1 != null; i++) {
            listNodes[i] = p1;
            int partSize = quotient + (i < remainder ? 1 : 0);
            for (int j = 1; j < partSize; j++) {
                p1 = p1.next;
            }
            ListNode next = p1.next;
            p1.next = null;
            p1 = next;
        }
        return listNodes;
    }
}
