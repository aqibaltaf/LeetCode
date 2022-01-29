class Solution {
    public int[] buildArray(int[] nums) {
        int[] k = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            k[i] = nums[nums[i]];
        }
        
        return k;
    }
}