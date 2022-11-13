import re
class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        s = re.sub("\s+"," ",s)
        words = s.split(" ")
        words.reverse()
        return ' '.join(map(str, words))
        
        