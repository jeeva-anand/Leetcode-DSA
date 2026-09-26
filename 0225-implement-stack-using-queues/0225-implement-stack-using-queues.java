class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque();
        q2 = new ArrayDeque();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        
        int size = q1.size() - 1;

        while(size > 0){
            q2.add(q1.remove());
            size--;
        }

        int top = q1.remove();

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }

        return top;
    }   
    
    public int top() {
         int size = q1.size() - 1;
        
        while(size > 0){
            q2.add(q1.remove());
            size--;
        }

        int top = q1.remove();

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }

        q1.add(top);
        return top;
    }
    
    public boolean empty() {
        
        return q1.isEmpty();
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