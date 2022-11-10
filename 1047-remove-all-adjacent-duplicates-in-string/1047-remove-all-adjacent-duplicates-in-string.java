class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
          if(!stack.isEmpty() && ch  == stack.peek()) {
            stack.pop();
          }
          else {
            stack.push(ch);
          }
        }
        char res[] = new char[stack.size()];
        int index = stack.size()-1;
        while(!stack.isEmpty()){
            res[index--] = stack.pop();
        }
        return new String(res);
    }
}