class Solution {
    public int calPoints(String[] ops){
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String num : ops){
            if (num.equalsIgnoreCase("C")) {
                sum -= st.pop();
            }
            else if (num.equalsIgnoreCase("D")) {
                st.push(st.peek() * 2);
                sum += st.peek();
            }
            else if (num.equalsIgnoreCase("+")) {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
                sum += a + b;
            }
            else {
            st.push(Integer.parseInt(num));
            sum += st.peek();
            }
        }
        return sum;
    }
}