class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        s = "";
        for (int i = 0; i < k; i++) {
            s = s + arr[i] + " ";
        }
        return s.trim();
    }
}