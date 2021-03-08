package q0232;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (!stack2.isEmpty()) {
            this.flushToStack1();
        }
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!stack1.isEmpty()) {
            flushToStack2();
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!stack1.isEmpty()) {
            flushToStack2();
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void flushToStack1() {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    private void flushToStack2() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
