class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0,j=0;
        for(; j<pushed.length; j++){
            stack.push(pushed[j]);
            while(i<popped.length && !stack.empty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return i==j;
    }
}