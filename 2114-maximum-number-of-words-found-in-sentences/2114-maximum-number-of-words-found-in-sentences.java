class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;
        for(int i = 1; i<sentences.length; i++){
            if(max <= sentences[i].split(" ").length)
            {
                max = sentences[i].split(" ").length;
            }
        }
        
        return max;
    }
}