class Solution {
    public int subtractProductAndSum(int n) {
        
        int prod = 1 , sum = 0;
        while (n > 0) {

            int remainder = n % 10;

            prod = prod * remainder;

            sum = sum + remainder;

            // Removing the last digit
            n = n / 10;

        }
        
        return prod-sum;
    }
}