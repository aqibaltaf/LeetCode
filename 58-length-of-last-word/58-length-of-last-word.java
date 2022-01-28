class Solution {
    public int lengthOfLastWord(String s) {
      String[] words = s.split(" ");
      String Last_Word = words[words.length - 1];
        
      return Last_Word.length();
        
    }
}