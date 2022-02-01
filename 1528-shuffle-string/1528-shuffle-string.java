class Solution {
    public String restoreString(String s, int[] indices) {
        String newstr = "";
        StringBuilder  x = new StringBuilder();
        
        for(int i = 0 ; i < indices.length; i++){
            for(int j = 0 ; j < indices.length ; j++){
                if(indices[j] == i){
                   x.append(s.charAt(j));
                }
            }
        }
        
        return newstr += x;
    }
}