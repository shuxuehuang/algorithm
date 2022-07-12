package linkedlist;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode newList = new ListNode(-1);//头节点
        ListNode tail = newList;//尾指针
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail =tail.next;
        }
        tail.next = list1 == null ? list2:list1;

        return newList.next;
    }
}
