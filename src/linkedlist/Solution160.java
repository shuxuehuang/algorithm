package linkedlist;

public class Solution160{
    //找到两个链表的相交节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode aTempNode = headA;
        ListNode bTempNode = headB;

        while(aTempNode != null){
            while(bTempNode!= null){
                if(aTempNode == bTempNode){
                    return aTempNode;
                }
                bTempNode = bTempNode.next;
            }
            aTempNode = aTempNode.next;
            bTempNode = headB;
        }
        return null;
}
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
