class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "--X":
                case "X--":
                    result = result - 1;
                    break;
                case "++X":
                case "X++":
                    result = result + 1;
                    break;
            }
        }

        return result;
    }
}