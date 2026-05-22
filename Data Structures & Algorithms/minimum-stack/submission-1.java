class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else{
            if(min.peek() <= val){
                min.push(min.peek());
            }else{
                min.push(val);
            }
        }
        
    }
    
    public void pop() {
        min.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
