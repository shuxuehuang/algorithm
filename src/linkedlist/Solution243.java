package linkedlist;

import java.util.Stack;

public class Solution243 {
    //回文链表
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        Stack<ListNode> listNodes = new Stack<>();
        ListNode p = head;
        while(p != null){
            listNodes.push(p);
            p = p.next;
        }
        while(!listNodes.empty() && head != null){
            ListNode pop = listNodes.pop();
            if(pop.val != head.val){
                return false;
            }
            head = head.next;
        }
        return true;

    }
}
