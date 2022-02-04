class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < nums.length;) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                arr.add(val);
            }
            i += 2;
        }
        Object[] b = arr.toArray();
        int[] a = new int[arr.size()];
        for (int i = 0; i < b.length; i++) {
            a[i] = (int) b[i];
        }

        return a;
    }
}