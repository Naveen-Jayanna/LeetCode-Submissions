class Solution {
    public String alphabetBoardPath(String target) {
        int x = 0, y=0;
        StringBuilder str = new StringBuilder();
        for(char ch: target.toCharArray()){
            int val = ch - 'a';
            int x1 = val/5;
            int y1 = val%5;
            while (x1 < x) {x--; str.append('U');}
            while (y1 > y) {y++; str.append('R');}
            while (y1 < y) {y--; str.append('L');}
            while (x1 > x) {x++; str.append('D');}
            str.append('!');
        }
        return str.toString();
    }
}