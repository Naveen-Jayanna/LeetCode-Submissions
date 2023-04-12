class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '*')
                stack.pop();
            else
                stack.push(c);
        }
        return stack.stream().map(a -> a.toString()).collect(Collectors.joining(""));
    }
}