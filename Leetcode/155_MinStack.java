/* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */

class MinStack {

    /** initialize your data structure here. */
    ArrayList<Integer> stack;
    int size;
    TreeSet<Integer> set;
    public MinStack() {
        stack = new ArrayList<>();
        set = new TreeSet<>();
        size = 0;
    }
    
    public void push(int x) {
        stack.add(x);
        set.add(x);
        size++;
        
    }
    
    public void pop() {
        int x = stack.get(size-1);
        stack.remove(size-1);
        size--;
        if(!stack.contains(x))
            set.remove(x);
    }
    
    public int top() {
        return stack.get(size-1);
    }
    
    public int getMin() {
        return set.first();
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