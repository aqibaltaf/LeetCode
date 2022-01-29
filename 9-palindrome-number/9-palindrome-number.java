class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String pld = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            pld = pld + str.charAt(i);
        }
        
       return pld.equals(str);
        
    }
}