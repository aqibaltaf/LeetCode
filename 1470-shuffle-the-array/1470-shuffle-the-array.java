class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[nums.length];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            a[count] = nums[i];
            a[count + 1] = nums[n + i];
            count = count + 2;

        }

        return a;
    }
}