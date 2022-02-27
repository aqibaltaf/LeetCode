class Solution(object):
    def replaceDigits(self, s):
        newstr = ""
        for i in range(0 , len(s)):
            if s[i].isdigit():
                a = chr(int(ord(s[i-1])) + int(s[i]))
                newstr += a
            else:    
                newstr = newstr + s[i]
            
        return newstr
    
        