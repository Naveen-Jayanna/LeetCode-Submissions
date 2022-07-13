class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList();
        String[] map = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        List<String> res = new ArrayList<>();
        backtrack(digits, map, 0, res, new StringBuilder());
        return res;
    }
    
    private void backtrack(String digits, String[] map, int index, List<String> res, StringBuilder curr){
        if (index == digits.length()){
            res.add(curr.toString());
            return;
        }
        char[] chars = map[digits.charAt(index)-'0'].toCharArray();
        for (char c: chars){
            curr.append(c);
            backtrack(digits, map, index+1, res, curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
//         private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
//     	public List<String> letterCombinations(String digits) {
//     		List<String> ret = new LinkedList<String>();
//             if(digits.length() == 0) return ret;
//     		combination("", digits, 0, ret);
//     		return ret;
//     	}
    
//     	private void combination(String prefix, String digits, int offset, List<String> ret) {
//     		if (offset >= digits.length()) {
//     			ret.add(prefix);
//     			return;
//     		}
//     		String letters = KEYS[(digits.charAt(offset) - '0')];
//     		for (int i = 0; i < letters.length(); i++) {
//     			combination(prefix + letters.charAt(i), digits, offset + 1, ret);
//     		}
//     }
// }