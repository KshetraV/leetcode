class Solution {
    public int evalRPN(String[] tokens) {
        
        int t=tokens.length;
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<t;i++) {
            switch (tokens[i]) {
                case "+":
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a + b);
                    break;
                case "*":
                     a = st.pop();
                     b = st.pop();
                    st.push(a * b);
                    break;
                case "-":
                     a = st.pop();
                     b = st.pop();
                    st.push(b - a);
                    break;
                case "/":
                     a = st.pop();
                     b = st.pop();
                    st.push(b / a);
                    break;
                default:
                    st.push(Integer.valueOf(tokens[i]));

            }
        }
        return st.peek();


    }
}
    
