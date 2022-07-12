package stack;

import java.util.Stack;

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s1.empty()){
            Integer pop = s1.pop();
            s2.push(pop);
        }
        s2.push(x);
        while (!s2.empty()){
            Integer pop = s2.pop();
            s1.push(pop);
        }
    }

    public int pop() {
        Integer pop = s1.pop();
        return pop;
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        if (s1.empty()){
            return true;
        }else{
            return false;
        }
    }
}
