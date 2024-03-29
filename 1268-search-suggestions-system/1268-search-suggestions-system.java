class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ret = new ArrayList();
        Arrays.sort(products);
        for(int i = 1; i <= searchWord.length(); i++) {
            List<String> toAdd = new ArrayList();
            String key = searchWord.substring(0,i);
            for(String product : products) {
                if(product.length() >= i && product.indexOf(key) == 0) {
                    toAdd.add(product);
                    if(toAdd.size() == 3) break;
                }
            }
            ret.add(toAdd);
        }
        return ret;
    }
}


// class Solution {
//     public List<List<String>> suggestedProducts(String[] products, String searchWord) {
//         Arrays.sort(products);
//         String match = "";
//         List<List<String>> result = new ArrayList<>();
//         for(char ch: searchWord.toCharArray()){
//             match += ch;
//             List<String> currRes = new ArrayList<>();
//             int count = 0;
//             for(String str: products){
//                 if(str.startsWith(match + "") && count<3){
//                     currRes.add(str);
//                     count++;
//                 }
//             }
//             result.add(currRes);
//         }
//         return result;
//     }
// }