class Solution(object):
    def firstPalindrome(self,words):
        for value in words:
            if(value == value[::-1]):
                return value
        
        return ""
        