class MyStack {

    Queue<Integer> q;


    public MyStack() {
        q = new ArrayDeque();
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        
        int size = q.size() - 1;

        while(size > 0){
            q.add(q.remove());
            size--;
        }

        return q.remove();
    }   
    
    public int top() {
         int size = q.size() - 1;
        
        while(size > 0){
            q.add(q.remove());
            size--;
        }

        int top = q.remove();

        q.add(top);
        return top;
    }
    
    public boolean empty() {
        
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */