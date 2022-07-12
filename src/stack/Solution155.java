package stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        dataStack.push(val);
        minStack.push(Math.min(val,minStack.peek()));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
