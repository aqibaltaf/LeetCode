class Solution {
    public int[] getConcatenation(int[] nums) {
        //Creating a new array to store values
        int[] b = new int[2*nums.length];
        //copying values to the new array
        for(int i = 0; i<nums.length;i++){
            b[i] = nums[i];
        }
        for(int i = 0 ; i<nums.length; i++){
            b[nums.length + i] = nums[i];
        }
        
        return b;
    }
}