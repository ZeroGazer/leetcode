package q0155;

import java.util.Stack;

class MinStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    private Integer min = null;

    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (!stack2.isEmpty()) {
            if (stack2.peek() >= x) {
                stack2.push(x);
            }
        } else {
            stack2.push(x);
        }
    }

    public void pop() {
        System.out.println(stack1.peek() == stack2.peek());
        if (stack1.peek().equals(stack2.peek())) {
            stack2.pop();
        }
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
