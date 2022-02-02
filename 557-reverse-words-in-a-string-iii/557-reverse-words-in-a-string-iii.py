class Solution(object):
    def reverseWords(self, s):
        a = s.split(" ")
        s = ""
        for value in a:
            s += value[::-1] + " "
            
        return(s[:-1])
        