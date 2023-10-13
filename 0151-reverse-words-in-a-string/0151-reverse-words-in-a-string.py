class Solution:
    def reverseWords(self, s: str) -> str:
        arr = s.split()
        x = ""
        for i in reversed(range(len(arr))):
            x += arr[i] + " " 
        return x.strip()    
        