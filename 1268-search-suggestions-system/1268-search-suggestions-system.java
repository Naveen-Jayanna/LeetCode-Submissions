class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        String match = "";
        List<List<String>> result = new ArrayList<>();
        for(char ch: searchWord.toCharArray()){
            match += ch;
            List<String> currRes = new ArrayList<>();
            int count = 0;
            for(String str: products){
                if(str.startsWith(match + "") && count<3){
                    currRes.add(str);
                    count++;
                }
            }
            result.add(currRes);
        }
        return result;
    }
}