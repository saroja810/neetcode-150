class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String ch : tokens){
            switch(ch){
                case "+":
                    int add = st.pop()+st.pop();
                    st.push(add);
                    break;
                case "-":
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a - b);
                    break;
                case "*":
                    int mul = st.pop() * st.pop();
                    st.push(mul);
                    break;
                case "/":
                    int second = st.pop();
                    int first = st.pop();
                    st.push(first / second);
                    break;
                default:
                    int x = Integer.parseInt(ch);
                    st.push(x);
            }
        }
        return st.pop();
    }
}
