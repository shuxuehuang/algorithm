package stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while(!q1.isEmpty()){
            Integer poll = q1.poll();
            q2.offer(poll);
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            Integer poll = q2.poll();
            q1.offer(poll);
        }
    }

    public int pop() {
        Integer poll = q1.poll();
        return poll;
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

