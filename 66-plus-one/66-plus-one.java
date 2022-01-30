class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        int count = 1;
        int[] arr = new int[digits.length + 1];
        if (digits[digits.length - 1] == 10) {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0; i--) {

                if (digits[i] != 9) {
                    digits[i] = digits[i] + 1;
                    break;

                } else {
                    digits[i] = (digits[i] + 1) % 10;
                    count++;
                }
            }
            if (digits[0] == 0 && count == digits.length) {
                arr[0] = 1;
                for (int j = 1; j < digits.length; j++) {
                    arr[j] = digits[j];
                }
                  digits = arr;
            }
        }

        return digits;
    }
}