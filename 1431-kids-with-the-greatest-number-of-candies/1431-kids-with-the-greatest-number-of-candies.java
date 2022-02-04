class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        ArrayList<Boolean> flag = new ArrayList();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                flag.add(Boolean.TRUE);
            }
            else{
                flag.add(Boolean.FALSE);
            }
        }
        
        return flag;

    }
}